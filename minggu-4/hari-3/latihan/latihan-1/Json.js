//1. ini percobaan pertama dengan tidak ada error
/*let json = '{"name":"Dariyanti", "age": 21}'; // data dari server

let user = JSON.parse(json); //mengubah representasi teks menjadi objek JS

// sekarang pengguna adalah objek dengan properti berupa string
alert(user.name); // Dariyanti
alert(user.age); // 21*/

//2. ini program kedua dengan try..catch
/*let json = "{ bad json }";

try {

    let user = JSON.parse(json); // <-- ketika kesalahan terjadi...
    alert(user.name); // ini tidak dapat bekerja

} catch (e) {
    // ...eksekusi langsung melompat kesni 
    alert("maaf, datanya memiliki kesalahan, kami akan mencoba memintanya sekali lagi.");
    alert(e.name);
    alert(e.message);
}*/

//3. ini juga dengan error
let json = '{ "age": 30 }'; // incomplete data
try {

    let user = JSON.parse(json);

    if (!user.name) {
        throw new SyntaxError("Incomplete data: no name");
    }

    blabla(); // unexpected error

    alert(user.name);

} catch (e) {

    if (e.name == "SyntaxError") {
        alert("JSON Error: " + e.message);
    } else {
        throw e; // rethrow (*)
    }

}