let range = {
    from: 1,
    to: 5
}
//1. Memanggil for..dari inisialisasi awal panggilan ini
range[Symbol.iterator] = function () {

    //mengembalikan objek iterator :
    //2. maju, for.. tidak berfungsi jika hanya dengan iterator ini, jadi akan menanyakan nilai selanjutnya
    return {
        current: this.from,
        last: this.to,

        //3. fungsi next() akan dipanggil pada setiap iterasi oleh for..f loop
        next() {
            //4. sebaiknya mengembalikan nilai sebagai sebuah objk{done :..,value:..}
            if (this.current <= this.last) {
                return {
                    done: false,
                    value: this.current++
                }
            }
        }

    }
}