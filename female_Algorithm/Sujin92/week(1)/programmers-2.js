function solution(participant, completion) {
  var answer = '';
  var isNotCompletion;

  participant.sort();
  completion.sort();

  participant.some((member, idx) => {
      isNotCompletion = member !== completion[idx];
      if (isNotCompletion) answer = member;
      return isNotCompletion;
  });
  return answer;
}