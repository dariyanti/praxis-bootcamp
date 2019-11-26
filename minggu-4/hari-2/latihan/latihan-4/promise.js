//untuk membuat promise cukup dengan memanggil constructurnya/nama variabelnya (promise)

var promise1 = new Promise(
    function (resolve, reject) {//ini merupakan listener.
        setTimeout(function () {
            resolve('foo');
        }, 300); //promise di delay selama 300 ms
    }
);
// untuk menggunakan promise bisa dengan method.then dan catch
promise1.then(function (value) {
    console.log(value);
    // expected output: "foo"
});

console.log(promise1);
// expected output: [object Promise]