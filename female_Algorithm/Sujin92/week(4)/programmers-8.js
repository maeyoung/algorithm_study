/**
 * 프로그래머스 : 같은 숫자는 싫어
 */
function solution (arr) {
  let answerArr = [];
  for (let index in arr) {
      if (arr[index] !== arr[parseInt(index) + 1]) answerArr.push(arr[index]);
  }
  return answerArr;
}

function solution (arr) {
  return arr.filter((item, index) => item !== arr[index + 1]);
}
