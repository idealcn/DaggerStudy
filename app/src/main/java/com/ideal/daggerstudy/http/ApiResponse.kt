package com.ideal.daggerstudy.http

import retrofit2.Response


/**
 * author: guo ning
 * date: 2020/5/21 10:46
 * qq: 3060974205
 * desc:
 */
sealed class ApiResponse<T> {
    companion object {
        fun <T> create(throwable: Throwable) :  ApiErrorResponse<T> {
            return ApiErrorResponse(throwable.message ?: "unknown error")
        }

        fun <T> create(response : Response<T>) :ApiResponse<T> {
            return if (response.isSuccessful){
                val body = response.body()
                if (body==null || response.code() == 204){
                    ApiEmptyResponse()
                }else {
                    ApiSuccessResponse(body)
                }
            }else {
               val msg = response.errorBody()?.string()
                val error = if (msg.isNullOrEmpty()){
                    response.message()
                }else {
                    msg
                }
                ApiErrorResponse(error)
            }
        }
    }
}



data class ApiSuccessResponse<T>(val  data : T) : ApiResponse<T>()
 class ApiEmptyResponse<T> : ApiResponse<T>()
data class ApiErrorResponse<T>(val throwable: String) : ApiResponse<T>()