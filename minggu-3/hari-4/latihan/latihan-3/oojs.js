/*Basically,semuanya, apapun didalam JavaScript adalah sebuah object atau 
    di berlakukan sebagai object, dan dapat disimpan didalam sebuah variabel
    Keep this in mind as you learn
*/
const person = {
    name: ['Dariyanti', 'Yanti'],
    age: 21,
    gender: 'Female',
    interest: ['music', 'sleep'],
    bio: function () {
        alert(this.name[0] + '' + this.name[1] + 'is' + this.age + 'years old. she likes' + this
            .interest[0] + '' + this.interest[1] + '.')
    },
    greeting: function () {
        alert('hi saya ' + this.name[0] + '.')
    }
}