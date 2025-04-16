
// const sentence = "Javascript strings are primitive and immutable: All string methods produce a new string without altering the original string.";
//
// // 1. 위의 문장을 각 단어가 원소인 배열로 변환하기 ["Javascript", "strings", "are", ....]
// const wordArray = sentence.split("");
// console.log("1. 단어 배열:", wordArray);
//
// // 2. 대문자 -> 소문자, 소문자는 -> 대문자로 바꾸어서 문장으로 만들기 jAVASCRIPT STRINGS ARE ....
// const toggledCase = sentence.split("").map(char => {
//         if (char >= 'A' && char <= 'Z') {
//             return char.toLowerCase();
//         } else if (char >= 'a' && char <= 'z') {
//             return char.toUpperCase();
//         }
//         return char;
//     }).join("");
// console.log("2. 대소문자 반전:", toggledCase);
//
// // 3. 위의 문장에서 [string] 이라는 단어를 [문자열] 으로 변환하기 Javascript 문자열s are ....
// const hangle = /[^가-힣]/;
// const converted = sentence.replace(/string/g, "문자열");
//  console.log("3. 'string' 단어 변환:", converted);
//
// danArray.forEach(function(dan) {
//     console.log(`\n[${dan}단]`);
//
//     [1, 2, 3, 4, 5, 6, 7, 8, 9].forEach(function(num) {
//         console.log(`${dan} x ${num} = ${dan * num}`);
//     });
// });

const arr = [36, 122, 79, 8, "무궁화", 391, "words", 509, 20192, "B", 321, 473, 73, "france", "Korea", 24, 99];

// 1. 오름차순 정렬 (숫자와 문자열을 모두 포함해서 정렬)
const sorted = [...arr].sort((a, b) => {
    if (typeof a === "number" && typeof b === "number"){
        return a - b;
    }
});
console.log("1. 오름차순 정렬:", sorted);

// 2. 가장 큰 값 출력 (숫자만 고려)
const numbersO = arr.filter(item => typeof item === "number");
const max = Math.max(...numbersO);
console.log("2. 가장 큰 값:", max);

// 3. 짝수인 요소만 배열로 출력

const evenNumber = arr.filter(num => num % 2 === 0);
console.log("3. 짝수만 출력:", evenNumber);

// 4. 문자열인 요소를 대문자로 변환해서 출력
const upperStrings = arr.filter(item => typeof item === "string").map(str => str.toUpperCase());
console.log("4. 대문자로 변환된 문자열:", upperStrings);

