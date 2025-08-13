function solveExam40() {
    let totalWeight = document.getElementById("exam40_01").value;
    // html 태그에서 id="exam04_01" 인 value 속성을 가져온다.
    let countFriends = document.getElementById("exam40_02").value;
    // html 태그에서 id="exam04_02" 인 value 속성을 가져온다.
    let strFriendWeights = document.getElementById("exam40_03").value;
    // html 태그에서 id="exam04_03" 인 value 속성을 가져온다.
    if ( checkValidInputExam40(totalWeight, countFriends, strFriendWeights) ) {
        // checkValidInputExam40 함수가 참이면 실행한다.
        let exam40 = new Exam40(totalWeight, countFriends, strFriendWeights);
        let result = exam40.solve();
        document.getElementById("exam40result").innerText = result;
    }
}

function checkValidInputExam40(totalWeight, countFriends, strFriendWeights) {
    if ( totalWeight <= 0 || totalWeight >= 1001) {
        alert("놀이기구 무게는 1 ~ 1000까지 입력하세요.");
        return false;
    }
    let arr = strFriendWeights.split(" ");
    if (countFriends != arr.length ) {
        alert("친구들의 숫자와 입력한 친구들의 몸무게 갯수가 다릅니다.");
        return false;
    }
    return true;
}

class Exam40 {
    totalWeight = 0;
    countFriends = 0;
    arrFriendWeights = [];

    constructor(tw, cf, strAfw) {
        // new Exam40(a, b, c);
        // Exam40 클래스를 인스턴스객체로 생성하는 비 기본생성자
        this.totalWeight = Number(tw);
        this.countFriends = Number(cf);
        this.arrFriendWeights = strAfw.split(" ").map((n) => Number(n));
        // Array.map( (매개변수) => Number(매개변수) );
        // => 배열의 모든원소를 숫자로 변환하여 새로운 배열을 리턴한다.
    }

    solve() {
        let i;
        let result = 0;
        for( i = 0; i < this.arrFriendWeights.length; i++ ) {
            if (this.totalWeight < result + this.arrFriendWeights[i]) {
                // 전체무게 < 이전원소까지 합산된 무게 + 현재원소의 무게
                break;   // 몇번째 원소 인지 리턴한다.
            }
            result += this.arrFriendWeights[i]; // 무게를 합산한다.
        }
        return i;
    }

}

class Exam41 {
    number = 0;

    constructor(number) {
        this.number = Number(number);
    }

    solve() {
        if (this.number < 2) {
            console.log("No");
            return;
        }

        for (let i = 2; i <= Math.sqrt(this.number); i++) {
            if (this.number % i === 0) {
                console.log("No");
                return;
            }
        }
        console.log("Yes");
    }
}


const primeCheck = new Exam41(19);
primeCheck.solve();

function solveExam42() {
    let year = document.getElementById("exam42_01").value;
    let month = document.getElementById("exam42_02").value;
    let date = document.getElementById("exam42_03").value;
    if ( checkValidInputExam42(year, month, date) ) {
        let selectDay = new Date(year, month - 1, date);
        let arrDay = ["SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"];
        document.getElementById("exam42result").innerText = arrDay[selectDay.getDay()];
    }
}

function checkValidInputExam42(year, month, date) {
    if ( year <= 0 || year >= 3000 ) {
        alert("년도는 1~2999년 으로 입력하세요.");
        return false;
    }
    if ( month <= 0 || month >= 13 ) {
        alert("월은 1~12 으로 입력하세요.");
        return false;
    }
    if ( date <= 0 || date >= 32 ) {
        alert("일은 1~31 으로 입력하세요.");
        return false;
    }
    return true;
}
function solveExam53() {
    let msg = document.getElementById("exam53_01").value;
    if ( checkValidInputExam53(msg) ) {
        let exam53 = new Exam53(msg);
        document.getElementById("exam53result").innerText = exam53.solve();
    }
}
function checkValidInputExam53(strMessage) {
    if( strMessage.length < 2 ) {
        alert("문자열을 2글자 이상 입력하세요.");
        return false;
    }
    return true;
}
function getNumber(item) {
    if (item == undefined) {    // typeof item == "undefined"
        // undefined + 1, undefined - 1 하면 NaN 오류가 발생
        return 0;
    }
    return Number(item);
}
class Exam53 {
    strMessage = "";

    constructor(msg) {
        this.strMessage = msg;
    }

    solve() {
        let mapBracket = new Map();
        for (let i = 0; i < this.strMessage.length; i++) {
            if (this.strMessage[i] == ")"
                || this.strMessage[i] == "}"
                || this.strMessage[i] == "]") {
                if (!mapBracket.has(this.strMessage[i])) {
                    return "NO";
                } else {
                    mapBracket.set(this.strMessage[i], mapBracket.get(this.strMessage[i]) - 1);
                    // 닫는괄호를 만나면 ), }, ] 키에 해당하는 값을 -1 시킨다.
                }
            } else if (this.strMessage[i] == "(") {
                // 여는괄호 ( 를 만나면 map.set(")", +1);
                //mapBracket.set(")", getNumber(mapBracket.get(")")) + 1);
                mapBracket.set(")", (mapBracket.has(")") ? mapBracket.get(")") : 0) + 1);
            } else if (this.strMessage[i] == "{") {
                // 여는괄호 { 를 만나면 map.set("}", +1);
//                mapBracket.set("}", getNumber(mapBracket.get("}")) + 1);
                mapBracket.set("}", (mapBracket.has("}") ? mapBracket.get("}") : 0) + 1);
            } else if (this.strMessage[i] == "[") {
                // 여는괄호 [ 를 만나면 map.set("]", +1);
//                mapBracket.set("]", getNumber(mapBracket.get("]")) + 1);
                mapBracket.set("]", (mapBracket.has("]") ? mapBracket.get("]") : 0) + 1);
            }
        }
        if (getNumber(mapBracket.get(")")) == 0
            && getNumber(mapBracket.get("}")) == 0
            && getNumber(mapBracket.get("]")) == 0) {
            // map.get(")") == 0 이면 ()() 완료
            // map.get("}") == 0 이면 {}{{}} 완료
            // map.get("]") == 0 이면 [[[]]] 완료
            return "YES";
        } else {
            return "NO";
        }
    }

}
class Exam58 {
    strInput = "";

    constructor(input) {
        // Exam58 클래스의 비기본 생성자
        this.strInput = input.toString();
        // 매개변수 input 의 값을 멤버변수 strInput 으로 복사 했다.
    }

    solve1() {
        // "123456789" ==> "987654321" 뒤집는다.
        let arrTemp = [...this.strInput].reverse();
        // console.log("exam58 solve : " + arrTemp);
        console.log(`exam58 solve 1 : ${arrTemp}`);
        // "987" + "," + "654" + "," ===> "987,654,321"
        let strTemp = "";
        for (let i = 0; i < arrTemp.length; i++) {
            if (i > 0 && i % 3 == 0) {
                strTemp += ",";
            }
            strTemp += arrTemp[i];
        }
        // "987,654,321" ==> "123,456,789"
        console.log(`exam58 solve 2 : ${strTemp}`);
        let result = [...strTemp].reverse().join("");
        console.log(`exam58 solve 3 : ${result}`);
        return result;
    }

    solve2() {
        // 뒤에서부터 처리한다
        // "56789" ==> 56,789  5개의 글자 => 인덱스 1번 에 콤마
        // "456789" ==> 456,789  6개의 글자 => 인덱스 2번 에 콤마
        // "3456789" ==> 3,456,789  7개의 글자 => 인덱스 3번, 0번 에 콤마
        // "23456789" ==> 23,456,789  8개의 글자 => 인덱스 4번, 1번 에 콤마
        // "123456789" ==> 123,456,789  9개의 글자 => 인덱스 5번, 2번 에 콤마
        // "1234567890" ==> 1,234,567,890  10개의 글자 => 인덱스 6번, 3번, 0번에 콤마
        // "123458769382" => 123,458,769,382  12개의 글자 => 인덱스 8번, 5번, 2번 에 콤마
        let result = "";
        let nComma = this.strInput.length - 4;
        for (let i = this.strInput.length - 1; i >= 0; i--) {
            if (i == nComma) {
                result += ",";
                nComma -= 3;
            }
            result += this.strInput[i];
        }
        return result.split("").reverse().join(""); // 987,654,321 ==> 123,456,789
    }
}
function solveExam58() {
    let number = document.getElementById("exam58_01").value;
    let exam58 = new Exam58(number);    // exam58 객체 생성할때 비기본생성자
    let result1 = exam58.solve1();    // exam58 객체의 solve 메소드 실행, 결과를 리턴
    document.getElementById("exam58result1").innerText = result1;
    let result2 = exam58.solve2();    // exam58 객체의 solve 메소드 실행, 결과를 리턴
    document.getElementById("exam58result2").innerText = result2;
    // html 태그의 ID 가 exam58result 인 <div id="exam58result">결과</div>
}
class Exam59 {
    strInput = "";
    constructor(input) {
        this.strInput = input;
    }
    solve1() {
        // strInput 50글자 => strInput(50글자) 전부출력
        // strInput 49글자 => 왼쪽에 '=' 1개, strInput 출력(49글자) => 하지 말자
        // strInput 49글자 => strInput 출력(49글자), 오른쪽에 '=' 1개,
        // strInput 48글자 => 왼쪽에 '=' 1개, strInput 출력(48글자), 오른쪽에 '=' 1개
        // strInput 40글자 => 왼쪽에 '=' 5개, strInput 출력(40글자), 오른쪽에 '=' 5개
        // strInput 39글자 => 왼쪽에 '=' 4개, strInput 출력(39글자), 오른쪽에 '=' 5개
        // strInput 28글자 => 왼쪽에 '=' 11개, strInput 출력(28글자), 오른쪽에 '=' 11개
        // strInput 19글자 => 왼쪽에 '=' 15개, strInput 출력(19글자), 오른쪽에 '=' 16개
        // strInput 9글자 => 왼쪽에 '=' 20개, strInput(9글자) 출력, 오른쪽에 '=' 21개
        // strInput 6글자 => 왼쪽에 '=' 22개, strInput(6글자) 출력, 오른쪽에 '=' 22개
        let spaceEqual = 50 - this.strInput.length;
        let leftSpaceEqual = Math.floor(spaceEqual / 2);
        let rightSpaceEqual = (leftSpaceEqual * 2 + this.strInput.length == 50 ?
            leftSpaceEqual : leftSpaceEqual + 1);
        let result = "";
        for( let i = 0; i < leftSpaceEqual; i++ ) {
            result += "=";
        }
        result += this.strInput;
        for( let i = 0; i < rightSpaceEqual; i++ ) {
            result += "=";
        }
        return result;
    }
    solve2() {
    }
}

function solveExam59() {
    let msg = document.getElementById("exam59_01").value;
    let exam59 = new Exam59(msg);
    let result = exam59.solve1();
    document.getElementById("exam59result").innerText = result;
}

class Exam61 {
    strInput = "";
    constructor(input) {
        this.strInput = input;
    }
    solve1() {
        let result = "";
        let nIndexArray = 0;// arrChar, arrCount 의 현재 인덱스
        let arrChar = [];   // 글자만 있는 배열
        let arrCount = [];  // 숫자만 있는 배열
        for( let i = 0; i < this.strInput.length; i++ ) {
            if( i == 0 ) { // 맨 첫글자
                arrChar.push(this.strInput[i]);
                arrCount.push(1);
            } else if ( arrChar[nIndexArray] == this.strInput[i] ) {
                // 같은글자
                arrCount[nIndexArray]++;
            } else {
                // 새로운글자
                arrChar.push(this.strInput[i]);
                arrCount.push(1);
                nIndexArray++;
            }
        }
        for( let j = 0; j < arrChar.length; j++ ) {
            result += arrChar[j] + arrCount[j];
        }
        return result;
    }
    solve2() {
        let count = 1;
        let result = "";
        for( let i = 0; i < this.strInput.length; i++ ) {
            if (result.length <= 0) {
                // 처음 문자
                result += this.strInput[i];
            } else if ( result.slice(-1) == this.strInput[i] ) {
                // 같은 문자
                count++;
            } else {
                // 다른 문자
                result += count + this.strInput[i];
                count = 1;
            }
        }
        return result + count;
    }
}

function solveExam61() {
    let msg = document.getElementById("exam61_01").value;
    let exam61 = new Exam61(msg);
    let result1 = exam61.solve1();
    document.getElementById("exam61result1").innerText = result1;
    let result2 = exam61.solve2();
    document.getElementById("exam61result2").innerText = result2;
}
class Exam68 {
    arrTimeBus = [];
    timeNow = "";
    constructor(timeBus, timeNow) {
        let arrHm = timeBus.split(", ");
        arrHm.forEach((item) => (this.arrTimeBus.push(this.makeDateObject(item.split(":")))));

        this.timeNow = this.makeDateObject(timeNow.split(":"));
    }
    makeDateObject(arrInput) {
        let dtTemp = new Date();
        dtTemp.setHours(Number(arrInput[0]));
        dtTemp.setMinutes(Number(arrInput[1]));
        dtTemp.setSeconds(0);
        return dtTemp;
    }
    solve() {
        let result = [];
        for( let i = 0; i < this.arrTimeBus.length; i++ ) {
            if ( this.timeNow >= this.arrTimeBus[i] ) {
                result.push("지나갔습니다.");
            } else {
                let msg = this.checkTime(this.timeNow, this.arrTimeBus[i]);
                result.push(msg);
            }
        }
        return result;
    }
    checkTime(timeNow, timeBus) {
        let diffMS = timeBus.getTime() - timeNow.getTime();
        let diffMin = diffMS / 1000 / 60;
        let diffHour = (Math.floor(diffMin / 60)).toString();
        let difMin = (diffMin % 60).toString();
        return `${diffHour.padStart(2,"0")}시간 ${difMin.padStart(2,"0")}분`;
    }
}

function solveExam68() {
    let timeBus = document.getElementById("exam68_01").value;
    let timeNow = document.getElementById("exam68_02").value;
    let exam68 = new Exam68(timeBus, timeNow);
    console.log(exam68.arrTimeBus);
    let result = exam68.solve();
    document.getElementById("exam68result").innerText = result;
}
function solveExam84() {
    let nNumber = document.getElementById("exam84_01").value;
    let kCount = document.getElementById("exam84_02").value;
}

function solveExam87() {
    let strMembers = document.getElementById("exam87_01").value;
    let strDishes = document.getElementById("exam87_02").value;
}

function solveExam91() {
}

function solveExam96() {
    let texts = document.getElementById("exam96_01").value;
    console.log(texts);
}