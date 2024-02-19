package hu.obuda.devops.fibonaccirestapi.service

import org.springframework.stereotype.Service

@Service
class FibonacciService {
    fun fibonacci(n: Int): Int {
        if(n<=2) return 1
        else return fibonacci(n-1)+fibonacci(n-2)


    }


}
