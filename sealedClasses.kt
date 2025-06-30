sealed class Result(val message: String) {
    fun showMessage() {
        println("Result: $message")
    }

    class Success(message: String) : Result(message)
    sealed class Error(message: String) : Result(message) {
        class RecoverableError(exception: Exception, message: String) : Error(message)
        class NonRecoverableError(exception: Exception, message: String) : Error(message)
    }
    class Progress(message: String) : Result(message)
}
fun main() {
    val success = Result.Success("Operation completed successfully")
    success.showMessage()

    val recoverableError = Result.Error.RecoverableError(Exception("Network issue"), "Temporary error occurred")
    recoverableError.showMessage()

    val nonRecoverableError = Result.Error.NonRecoverableError(Exception("Fatal error"), "Critical failure")
    nonRecoverableError.showMessage()

    val progress = Result.Progress("Loading data...")
    progress.showMessage()

    // when in sealed class
   fun handleResult(result: Result) {
    when (result) {
        is Result.Success -> println("Success: ${result.message}")
        is Result.Error.RecoverableError -> println("Recoverable Error: ${result.message}")
        is Result.Error.NonRecoverableError -> println("Non-Recoverable Error: ${result.message}")
        is Result.Progress -> println("Progress: ${result.message}")
    }
}
