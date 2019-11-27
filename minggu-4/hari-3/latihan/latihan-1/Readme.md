# Penjelasan Latihan 1 Error Handling

Error Handling ditandai dengan `try ... catch` dengan penjelasan :

- `Blok Try`, biasanya kita sisipkan code javascript yang mungkin terjadi error
- `Blok Catch`, pada blok inilah yang akan menangkap error yang terjadi pada blok Try apabila pada blok Try si error muncul. Secara default, kita bisa ambil semua jenis error tanpa harus menuliskan jenis error.

jadi apapun yang terjadi pada apapun error yang terjadi pada blok `try` akan langsung ditangkap oleh `catch`

contoh :

1. percobaan pertama tanpa error

`try {`

`alert('Start of try runs'); // (1) <--`

`// ...no errors here`

`alert('End of try runs'); // (2) <--`

`} catch(err) {`

`alert('Catch is ignored, because there are no errors'); // (3)`

`}`

2.percobaan kedua dengan adanya error

`try {`

`alert('Start of try runs'); // (1) <--`

`lalala; // error, variable is not defined!`

`alert('End of try (never reached)'); // (2)`

`} catch(err) {`

`alert(``Error has occurred!``); // (3)`

`<--`

`}`
