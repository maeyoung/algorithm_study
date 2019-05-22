/**
 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 * @param {string} s
 * @return {string}
 */
function solution(s) {
  const middle = (s.length / 2) + s.length % 2 - 1
  const isEvenNumber = s.length % 2 === 0
  return isEvenNumber ? s.slice(middle, middle + 2) : s.slice(middle, middle + 1);
}