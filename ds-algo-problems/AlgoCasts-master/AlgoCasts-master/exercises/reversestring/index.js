// --- Directions
// Given a string, return a new string with the reversed
// order of characters
// --- Examples
//   reverse('apple') === 'leppa'
//   reverse('hello') === 'olleh'
//   reverse('Greetings!') === '!sgniteerG'

function reverse(str) {
    let reveseStr = "";
    for(let i=str.length;i>0;i--){
        reveseStr=reveseStr+str.charAt(i-1);
    }
    // console.log("reverse : ", reveseStr);
    return reveseStr

}

module.exports = reverse;
