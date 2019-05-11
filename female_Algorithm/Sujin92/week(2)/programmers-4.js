// 프로그래머스 - 알고리즘 연습 - K번째 수
function solution(array, commands) {
  return commands.map(item => {
      const sliceArr = array.slice(item[0] - 1, item[1]).sort((a, b) => a - b);
      return sliceArr[item[2] - 1];
  });
}
