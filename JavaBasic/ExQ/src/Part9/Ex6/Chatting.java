package Part9.Ex6;

public class Chatting {
    void startChat(String chatId) {
        String nickName = null;
        nickName = chatId;

        Chat chat = new Chat() {
            @Override
            void start() {
                while (true){
                    String inputData = "안녕하세요";
                    //String message = nickName + " " + inputData;
                    //
                }
            }

        };
    }

    class Chat {
        void start() {}
        void sendMessage(String message) {}
    }
}
// nickName은 중첩 클래스 안에서 사용되기 때문에 final특성을
// 갖게 된다. null로 정의된 nickName을 다시 chatId로 정의 했기 때문에
// final특성을 갖는 nickName을 보고 컴파일 에러 발생.