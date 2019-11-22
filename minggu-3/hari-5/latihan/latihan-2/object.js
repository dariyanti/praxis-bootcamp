// 1. fungsi sumSalaries
/*
function sumSalaries(salaries) {
    let sum = 0
    for (let salary of Object.values(salaries)) {
        sum += salary
    }
    return sum
}
let salaries = {
    'Dariyanti': 100,
    'Yanti': 200
}
alert(sumSalaries(salaries))
*/

//2. fungsi count
function count(obj) {
    return Object.keys(obj).length
}
let user = {
    name = 'Dariyanti',
    age = 21
}
alert(count(user))