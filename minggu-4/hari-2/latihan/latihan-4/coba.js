var promise = new Promise(
    (resolve, reject) => {
        //resolve("berhasil")
        reject(new error("janji dibatalkan"))
    }
)
promise.then((result) => {
    console.log(result)
})
promise.catch((error) => {
    console.log(error)
})