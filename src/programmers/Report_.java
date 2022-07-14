package programmers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Report_ {
//    Set : 데이터를 중복 저장할 수 없고, 입력 순서대로의 저장순서를 보장 받을 수 없는 자료구조
//    HashSet : Set 인터페이스를 구현. 순서가 필요없는 데이터를 hash table 에 저장. Set 중 가장 성능이 좋고, put() 메소드를 사용해 데이터를 넣는다. HashMap 인스턴스를 사용한다.
//    HashMap : Map 인터페이스를 구현. key-value 형식의 데이터를 저장. 중복된 key 값을 허용하지 않는다. add() 메소드를 사용해 데이터를 넣는다.


    public static void main(String[] args) {
                String [] id_list = {"muzi", "frodo", "apeach", "neo"};
                int k = 2;
                String [] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};

                String [][] reports = new String[report.length][2];

        int[] solution = solution(id_list, report, k);

    }
                
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        answer = new int[id_list.length];
        Map<String, HashSet<String>> reportedMap = new HashMap<>(); // [신고된 ID, [신고한 ID]]
        Map<String, Integer> answerMap = new HashMap<>(); // [신고된 ID, 메일 수>

        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> reportingId = new HashSet<>(); //신고한 ID
            reportedMap.put(id_list[i], reportingId ); // UID, 신고 ID 초기회

            answerMap.put(id_list[i], 0 ); //모두 0으로 초기화
        }
        System.out.println("[STEP 1] reportedMap : " + reportedMap);
        System.out.println("[STEP 2] answerMap : " + answerMap);

        //신고 기록 세팅

        for (String s : report) {
            String[] reportStr = s.split(" ");
            String reportingID = reportStr[0]; // 신고한ID
            String reportedID = reportStr[1]; // 신고된ID
            reportedMap.get(reportedID).add(reportingID); // 신고된ID 를 key 값으로 신고한ID 배열을 value 로 새팅
        }
        System.out.println("[STEP 2] reportedMap 에 신고 기록 세팅 : " + reportedMap);


        // 유저가 받을 이용 정지 결과 메일 세팅

        for (String reportedUser : reportedMap.keySet()) {// reportedUser 는 신고된 ID 유저
            HashSet<String> userForSend = reportedMap.get(reportedUser);

            if (userForSend.size() >= k) {//신고된 횟수가 K번 이상인지 체크
                for (String userID : userForSend) {
                    answerMap.put(userID, answerMap.get(userID) + 1);
                }
            } }
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = answerMap.get(id_list[i]);
            System.out.println("최종결과");

        }
        return answer;

    }

            }


        /* 문제 설명
        신입사원 무지는 게시판 불량 이용자를 신고하고 처리 결과를 메일로 발송하는 시스템을 개발하려 합니다. 무지가 개발하려는 시스템은 다음과 같습니다.

        각 유저는 한 번에 한 명의 유저를 신고할 수 있습니다.
        신고 횟수에 제한은 없습니다. 서로 다른 유저를 계속해서 신고할 수 있습니다.
        한 유저를 여러 번 신고할 수도 있지만, 동일한 유저에 대한 신고 횟수는 1회로 처리됩니다.
        k번 이상 신고된 유저는 게시판 이용이 정지되며, 해당 유저를 신고한 모든 유저에게 정지 사실을 메일로 발송합니다.
        유저가 신고한 모든 내용을 취합하여 마지막에 한꺼번에 게시판 이용 정지를 시키면서 정지 메일을 발송합니다.
        다음은 전체 유저 목록이 ["muzi", "frodo", "apeach", "neo"]이고, k = 2(즉, 2번 이상 신고당하면 이용 정지)인 경우의 예시입니다.

        유저 ID	유저가 신고한 ID	설명
        "muzi"	"frodo"	"muzi"가 "frodo"를 신고했습니다.
        "apeach"	"frodo"	"apeach"가 "frodo"를 신고했습니다.
        "frodo"	"neo"	"frodo"가 "neo"를 신고했습니다.
        "muzi"	"neo"	"muzi"가 "neo"를 신고했습니다.
        "apeach"	"muzi"	"apeach"가 "muzi"를 신고했습니다.
        각 유저별로 신고당한 횟수는 다음과 같습니다.

        유저 ID	신고당한 횟수
        "muzi"	1
        "frodo"	2
        "apeach"	0
        "neo"	2
        위 예시에서는 2번 이상 신고당한 "frodo"와 "neo"의 게시판 이용이 정지됩니다. 이때, 각 유저별로 신고한 아이디와 정지된 아이디를 정리하면 다음과 같습니다.

        유저 ID	유저가 신고한 ID	정지된 ID
        "muzi"	["frodo", "neo"]	["frodo", "neo"]
        "frodo"	["neo"]	["neo"]
        "apeach"	["muzi", "frodo"]	["frodo"]
        "neo"	없음	없음
        따라서 "muzi"는 처리 결과 메일을 2회, "frodo"와 "apeach"는 각각 처리 결과 메일을 1회 받게 됩니다.

        이용자의 ID가 담긴 문자열 배열 id_list, 각 이용자가 신고한 이용자의 ID 정보가 담긴 문자열 배열 report, 정지 기준이 되는 신고 횟수 k가 매개변수로 주어질 때, 각 유저별로 처리 결과 메일을 받은 횟수를 배열에 담아 return 하도록 solution 함수를 완성해주세요.

        제한사항
        2 ≤ id_list의 길이 ≤ 1,000
        1 ≤ id_list의 원소 길이 ≤ 10
        id_list의 원소는 이용자의 id를 나타내는 문자열이며 알파벳 소문자로만 이루어져 있습니다.
        id_list에는 같은 아이디가 중복해서 들어있지 않습니다.
        1 ≤ report의 길이 ≤ 200,000
        3 ≤ report의 원소 길이 ≤ 21
        report의 원소는 "이용자id 신고한id"형태의 문자열입니다.
        예를 들어 "muzi frodo"의 경우 "muzi"가 "frodo"를 신고했다는 의미입니다.
        id는 알파벳 소문자로만 이루어져 있습니다.
        이용자id와 신고한id는 공백(스페이스)하나로 구분되어 있습니다.
        자기 자신을 신고하는 경우는 없습니다.
        1 ≤ k ≤ 200, k는 자연수입니다.
        return 하는 배열은 id_list에 담긴 id 순서대로 각 유저가 받은 결과 메일 수를 담으면 됩니다.
        입출력 예
        id_list	report	k	result
        ["muzi", "frodo", "apeach", "neo"]	["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"]	2	[2,1,1,0]
        ["con", "ryan"]	["ryan con", "ryan con", "ryan con", "ryan con"]	3	[0,0]
        입출력 예 설명
        입출력 예 #1

        문제의 예시와 같습니다.

        입출력 예 #2

        "ryan"이 "con"을 4번 신고했으나, 주어진 조건에 따라 한 유저가 같은 유저를 여러 번 신고한 경우는 신고 횟수 1회로 처리합니다. 따라서 "con"은 1회 신고당했습니다. 3번 이상 신고당한 이용자는 없으며, "con"과 "ryan"은 결과 메일을 받지 않습니다. 따라서 [0, 0]을 return 합니다.*/

