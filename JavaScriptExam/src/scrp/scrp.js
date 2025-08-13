// let strToDay = new Date();
// console.log(`오늘 날씨는 ${strToDay}입니다.`);
// console.log(`오늘 년도는 ${strToDay.getFullYear()}입니다.`);
// console.log(`오늘 월은 ${strToDay.getMonth()}입니다.`);
// console.log(`오늘 일는 ${strToDay.getDate()}입니다.`);
// console.log(`오늘 주는 ${strToDay.getDay()}입니다.`);
// console.log(`오늘 시는 ${strToDay.getHours()}입니다.`);
// console.log(`오늘 분는 ${strToDay.getMinutes()}입니다.`);
//
// console.log(`50일을 더한 날짜는 ${strToDay.getDate() + 50} 입니다.`);
//


// 1번 로또 만들기
// 1~45번 까지의 숫자 5개 + 보너스1개 를 랜덤으로 만든다.
// 중복된 숫자는 제거한다.
// 숫자 6개 저장되는 배열 선언하여 오름차순으로 정렬한다.
// Math.random()
// 곱하기
// Math.ceil(값)
// function generateLotto() {
//     const numbers = new Set();
//
//     while (numbers.size < 6) {
//         const num = Math.ceil(Math.random() * 45);
//         numbers.add(num);
//     }
//     const lottoArray = Array.from(numbers).sort((a, b) => a - b);
//     const bonus = lottoArray.pop();
//     const mainNumbers = lottoArray;
//     console.log("번호:", mainNumbers);
//     console.log("추가 번호:", bonus); //그 보너스?
// }
// generateLotto();
//
// // 2번 문제10번 별찍기
// let n = 5;
//
// for (let i = 1; i <= n; i++) {
//     let spaces = " ".repeat(n - i); //공간?
//     let stars = "*".repeat(i); // 별
//     console.log(spaces + stars);
// }
//
// // 3번 문제12번 게임캐릭터클래스
// const Wizard = class Wizard {
//     constructor (health, mana, armor){
//         this.health = health;
//         this.mana = mana;
//         this.armor = armor;
//     }
//     attack(){
//         console.log('파이어볼');
//     }
// }
// const x = new Wizard(545, 210, 10);
// console.log(x.health, x.mana, x.armor);
// x.attack();
//
// // 4번 문제13번 let strInput = prompt("입력하세요");
// const plans = ['수성', '금성', '지구', '화성', '목성', '토성', '천왕성', '해왕성'];
// const number = prompt("몇번째 행성인가요?");
// console.log(plans[number-1]);
//
// // 5번 문제16 // 문장이 입력되면 거꾸로
// const hangle = prompt("한글을 입력해주세요");
// const reverseString = hangle.split().reverse().join();
// console.log(hangle);

// 6번 문제 17 놀이기구 키 제한 입력으로 키가 주어지면 키가 150 넘으면 Yes틀리면 No
// class 클래스이름 {
//     멤버변수이름1 = 초기값;
//     멤버변수이름2 = 초기값;
//     constructor(매개변수1, 매개변수2, ..) {
//         this.멤버변수이름1 = 매개변수1;
//         this.멤버변수이름2 = 매개변수2;
//     }
//     멤버메소드(매개변수1, 매개변수2, ..) {
//         메소드 명령어들;
//     }
// }
// 17번
// class tall {
//     height = 0;
//
//     constructor(height) {
//         this.height = height;
//     }
//     check() {
//         if (this.height > 150) {
//             console.log("Yes");
//         } else {
//             console.log("No");
//         }
//     }
// }
//
// const userInput = prompt("키를 입력하세요");
// const heightSolution = parseInt(userInput);
//
// const answer = new tall(heightSolution);
// answer.check();

// 평균점수 - 공백으로 구분하여 세 과목의 점수가 주어지면 전체 평균 점수를 구하는 자바스크립트 프로그램으로
// 작성 단, 소숫점 자리는 모두 버린다.(class 형식으로 만들어줘)
// 18번
// class ScoreCalculator {
//     constructor() {
//         this.scores = [];
//     }
//
//     inputScores() {
//         for (let i = 0; i < 3; i++) {
//             const score = parseInt(prompt(`${i + 1}번째 과목 점수를 입력하세요:`), 10);
//             if (isNaN(score)) {
//                 console.log("숫자를 입력해주세요.");
//                 i--;
//             } else {
//                 this.scores.push(score);
//             }
//         }
//         const total = this.scores.reduce((sum, score) => sum + score, 0);
//         return Math.floor(total / this.scores.length);
//     }
//
// }
// const answerScores = new answerScores();
// answerScores.inputScores(); //해결 못함

// 19번
// 공백으로 구분하여 두 숫자 a와 b 가 주어지면, a의 b승을 구한느 프로그램을 작성해라
// const mth = prompt('a와 b승의 숫자를 입력해주세요.(공백 없이)').split('');
// let result = mth[0] ** mth[1];
// console.log(result);

// 26번
// 행성의 수성, 금성, 지구, 화성, 목성, 토성, 천왕성, 해왕성의 영어 이름 Mercury, Venus, Earth, Mars, Jupiter,
// Saturn, Uranus, Neptune 이 있는데 한글을 입력하면 영어 이름을 반환하는 프로그램을 만들자. 클래스 한개 생성

// const Plants = {
//     '수성': Mercury,
//     '금성': Venus,
//     '지구': Earth,
//     '화성': Mars,
//     '목성': Jupiter,
//     '토성': Saturn,
//     '천왕성': Uranus,
//     '해왕성': Neptune,
// };
//
// const Pname = prompt('행성 이름을 출력해주세요:');
// console.log(Plants[Pname]);

// class Exam27 {
//     maps = new Map();
//
//     inputFunc() {
//         let names = prompt("이름을 공백으로 구분하여 입력하세요.");
//         let score = prompt("점수를 공백으로 구분하여 입력하세요.");
//         let arrName = names.split(" ");
//         let arrScore = score.split(" ");
//
//         if (arrName.length !== arrScore.length) {
//             alert("두 배열의 길이가 다릅니다. 다시 시작하세요.");
//             return false; // 함수가 false 를 리턴한다.
//         }
//         for (let i = 0; i < arrName.length; i++) {
//             this.maps.set(arrName[i], Number(arrScore[i]));
//         }
//
//         console.log(this.maps);
//         return true;  // 함수가 true 를 리턴한다.
//     }
//
//     outputFunc() {
//         let strOutput = "{";
//         for (let [name, score] of this.maps) {
//             strOutput += `'${name}': ${score}, `;
//         }
//         strOutput = strOutput.substring(0 , strOutput.length - 2);
//         // 문자열의 길이에서 -2 시킨 길이의 문자열로 다시 저장. "abcd" => "ab"
//         strOutput += "}";
//         console.log(strOutput);
//     }
// }
//
// let exam = new Exam27();
// if (exam.inputFunc()) {  // inputFunc() 를 실행하고 리턴값이 true 이면
//     exam.outputFunc(); // outputFunc() 를 실행한다.
// }


// class Exam28 {
//     strInput = "";
//
//     constructor(str) {
//         this.strInput = str;
//     }
//     output() {
//
//         for (let i = 0; i < this.strInput.length; i += 2) {
//             console.log(this.strInput.substr(i, 2));
//         }
//     }
// }
// let exam28 = new Exam28(prompt("문자 입력하세요."));
// exam28.output();

// class Exam37 {
//     arrItem = [];
//     maps = new Map();
//
//     constructor(input) {
//         this.arrItem = input.split(" ");
//     }
//
//     checkVotes() {
//         for (let name of this.arrItem) {
//             if (this.maps.has(name)) {
//                 this.maps.set(name, this.maps.get(name) + 1);
//             } else {
//                 this.maps.set(name, 1);
//             }
//         }
//         let maxName = "";
//         let maxCount = 0;
//
//         for (let [name, count] of this.maps.entries()) {
//             if (count > maxCount) {
//                 maxCount = count;
//                 maxName = name;
//
//             }
//         }
//
//         return [maxName, maxCount];
//     }
// }
//
// let exam37 = new Exam37(prompt("투표할 항목을 공백으로 구분해서 입력하세요."));
// let result = exam37.checkVotes();
// console.log(`투표 결과 ${result[0]}가 ${result[1]}표로 반장이 되었습니다.`);



