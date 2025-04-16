
const fruits1 = ["Banana", "orange", "Apple", "mango"];
fruits1.sort();  // 기본 정렬: 대문자 -> 소문자 순
console.log("기본 문자열 정렬:", fruits1);


const fruits2 = ["Banana", "orange", "Apple", "mango"];
fruits2.sort(function(a, b) {
    return a.toLowerCase().localeCompare(b.toLowerCase());
});
console.log("대소문자 무시 문자열 정렬:", fruits2);

// 숫자 배열 오름차순 정렬
const points1 = [40, 100, 1, 5, 25, 10];
points1.sort(function(a, b) {
    return a - b;
});
console.log("숫자 오름차순 정렬:", points1);

//  숫자 배열 내림차순 정렬
const points2 = [40, 100, 1, 5, 25, 10];
points2.sort(function(a, b) {
    return b - a;
});
console.log("숫자 내림차순 정렬:", points2);


