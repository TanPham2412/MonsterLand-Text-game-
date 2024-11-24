package com.example.monsterland;

import android.view.View;

import java.security.PublicKey;

public class Story {

    GameScreen gameScreen;
    String nextPosition1, nextPosition2, nextPosition3;

    String status;
    int statusNum = 0;

    boolean postion = false;
    boolean knife = false;
    boolean fragment = false;
    boolean sword = false;
    public Story(GameScreen gameScreen){
        this.gameScreen = gameScreen;
    }

    public void showAllButton(){
        gameScreen.button1.setVisibility(View.VISIBLE);
        gameScreen.button2.setVisibility(View.VISIBLE);
        gameScreen.button3.setVisibility(View.VISIBLE);
    }

    public void selectPosition(String position){
        switch (position){
            case "next1": opening2(); break;
            case "meetMira": meetMira(); break;
            case "mira1": mira1(); break;
            case "mira2":mira2(); break;
            case "mira3": mira3(); break;
            case "deadMira": deadMira(); break;
            case "goTitleScreen": gameScreen.goTitleScreen(); break;
            case "tenebris": tenebris(); break;
            case "village": village(); break;
            case "help": help();;break;
            case "nohelp": nohelp(); break;
            case "darkAltar": darkAltar(); break;
            case "wolf": wolf(); break;
            case "owl": owl(); break;
            case "deer": deer(); break;
            case "recovery": recovery(); break;
            case "darkDeer": darkDeer(); break;
            case "useSilverKnife": useSilverKnife(); break;
            case "knifeThrow": knifeThrow(); break;
            case "frontalAttack": frontalAttack(); break;
            case "artifact": artifact(); break;
            case "dead": dead(); break;
            case "argentis": argentis(); break;
            case "waterfountain": waterfountain(); break;
            case "left": left(); break;
            case "right": right(); break;
            case "mid": mid(); break;
            case "dragon": dragon(); break;
            case "useFragment": useFragment(); break;
            case "attack": attack(); break;
            case "miraPostion": miraPostion(); break;
            case "artifact2": artifact2(); break;
            case "blackTower": blackTower(); break;
            case "door": door(); break;
            case "castleRoad": castleRoad(); break;
            case "truthFire": truthFire(); break;
            case "darkFire": darkFire(); break;
            case "noAnswer": noAnswer(); break;
            case "darkLord": darkLord(); break;
            case "useRuneSword": useRuneSword(); break;
            case "postionFragment": postionFragment(); break;
            case "attack1": attack1(); break;
            case "artifact3": artifact3(); break;
            case "saveUmbra": saveUmbra(); break;
            case "saveYourSelf": saveYourSelf(); break;
        }
    }
    public void opening1(){
        gameScreen.imageView.setImageResource(R.drawable.city);
        status = "rất tốt";
        statusNum = 0;
        gameScreen.textView1.setText("Thể trạng: "+status);
        gameScreen.textView.setText("Bạn sống trong thành phố Umbra, nơi một lời nguyền cổ xưa đã đè nặng lên đời sống của người dân, khiến nhiều người mắc phải các biến chứng kỳ lạ. Những cơn gió mang theo mùi hương tẩm thuốc và bóng tối vương vấn trong không gian.");

        gameScreen.button1.setText(">");
        gameScreen.button2.setText("");
        gameScreen.button3.setText("");

        nextPosition1 = "next1";
        nextPosition2 = "";
        nextPosition3 = "";
        gameScreen.button2.setVisibility(View.INVISIBLE);
        gameScreen.button3.setVisibility(View.INVISIBLE);
    }

    public void opening2(){
        gameScreen.imageView.setImageResource(R.drawable.scar);
        gameScreen.textView1.setText("Thể trạng: "+status);
        gameScreen.textView.setText("Bạn nhận ra rằng đó là dấu vết của một con quái vật đã chết, nhưng lời nguyền vẫn còn tồn tại. Để giải thoát khỏi số phận này, bạn phải tìm Mira, một thầy thuốc nổi tiếng trong thành phố, nhờ giúp đỡ.");

        gameScreen.button1.setText(">");
        gameScreen.button2.setText("");
        gameScreen.button3.setText("");

        gameScreen.button2.setVisibility(View.INVISIBLE);
        gameScreen.button3.setVisibility(View.INVISIBLE);

        nextPosition1 = "meetMira";
        nextPosition2 = "";
        nextPosition3 = "";
    }

    public void meetMira(){
        gameScreen.imageView.setImageResource(R.drawable.mira);
        gameScreen.textView1.setText("Thể trạng: "+status);
        gameScreen.textView.setText("Bạn đến gặp Mira\n\nMira nhìn bạn một lúc lâu, đôi mắt cô thoáng chút lo lắng nhưng đầy quyết tâm. Cô hỏi:\n\"Ngươi có thể cho ta biết rõ hơn về dấu ấn này? Nó là vết thương cũ hay dấu hiệu của nguy hiểm? Nếu cần, ta sẵn lòng giúp, nhưng ta cần biết sự thật.\"");

        gameScreen.button1.setText("Bạn thú nhận sự thật");
        gameScreen.button2.setText("Nói dối đây là vết thương cũ");
        gameScreen.button3.setText("Bạn im lặng");

        showAllButton();

        nextPosition1 = "mira1";
        nextPosition2 = "mira2";
        nextPosition3 = "mira3";
    }

    public void mira1(){
        gameScreen.imageView.setImageResource(R.drawable.postion);
        gameScreen.textView1.setText("Thể trạng: "+status);
        gameScreen.textView.setText("Mira nhìn bạn, lo lắng nhưng quyết tâm, rồi đồng ý giúp. Cô giải thích dấu ấn là lời nguyền cổ, chỉ phá vỡ khi thu đủ ba mảnh vỡ. Các mảnh vỡ nằm ở 3 địa điểm: Rừng Đen - Tenebris, Hồ Bạc - Argentis và Thành Trì Tháp Đen - The Black Tower.\n\nMira đưa bạn một lọ thuốc đặc biệt để hỗ trợ bạn.");

        postion = true;

        gameScreen.button1.setText(">");
        gameScreen.button2.setText("");
        gameScreen.button3.setText("");

        gameScreen.button2.setVisibility(View.INVISIBLE);
        gameScreen.button3.setVisibility(View.INVISIBLE);

        nextPosition1 = "tenebris";
        nextPosition2 = "";
        nextPosition3 = "";
    }

    public void mira2(){
        gameScreen.imageView.setImageResource(R.drawable.think);
        gameScreen.textView1.setText("Thể trạng: "+status);
        gameScreen.textView.setText("Mira nghi ngờ nhưng vẫn quyết định giúp bạn, trao bạn thuốc giảm đau xoa dịu lời nguyền và hướng dẫn vượt các thử thách. Dù vậy, ánh mắt cô vẫn thoáng lo ngại, và mối quan hệ giữa bạn và Mira không hoàn toàn gắn kết do thiếu sự thật.");

        gameScreen.button1.setText(">");
        gameScreen.button2.setText("");
        gameScreen.button3.setText("");

        gameScreen.button2.setVisibility(View.INVISIBLE);
        gameScreen.button3.setVisibility(View.INVISIBLE);

        nextPosition1 = "tenebris";
        nextPosition2 = "";
        nextPosition3 = "";
    }

    public void mira3(){
        gameScreen.imageView.setImageResource(R.drawable.look);
        gameScreen.textView1.setText("Thể trạng: "+status);
        gameScreen.textView.setText("Mira nhìn bạn một cạch đầy sợ hãi và ra lệnh cho anh rời đi ngay lập tức.");

        gameScreen.button1.setText(">");
        gameScreen.button2.setText("");
        gameScreen.button3.setText("");

        gameScreen.button2.setVisibility(View.INVISIBLE);
        gameScreen.button3.setVisibility(View.INVISIBLE);

        nextPosition1 = "deadMira";
        nextPosition2 = "";
        nextPosition3 = "";
    }
    public void deadMira() {
        gameScreen.imageView.setImageResource(R.drawable.dead);
        gameScreen.textView1.setText("");
        gameScreen.textView.setText("Không còn ai hướng dẫn và giúp bạn xóa bỏ lời nguyền, sau một thời gian, bạn chết vì lời nguyền!\n\nGAME OVER!");

        gameScreen.button1.setText("Quay lại màn hình bắt đầu");
        gameScreen.button2.setText("");
        gameScreen.button3.setText("");

        gameScreen.button2.setVisibility(View.INVISIBLE);
        gameScreen.button3.setVisibility(View.INVISIBLE);

        nextPosition1 = "goTitleScreen";
        nextPosition2 = "";
        nextPosition3 = "";
    }

    public void tenebris(){
        gameScreen.imageView.setImageResource(R.drawable.jungle);
        gameScreen.textView1.setText("Thể trạng: "+status);
        gameScreen.textView.setText("Bạn bước vào Rừng Tenebris, nơi tiếng gió rít lên như những tiếng thở của ma quái, và bóng tối dày đặc che lấp con đường phía trước. Mảnh vỡ đầu tiên của lời nguyền được cho là nằm sâu trong lòng rừng, nơi những sinh vật kỳ dị sinh sống và bảo vệ nó bằng mọi giá.");

        gameScreen.button1.setText(">");
        gameScreen.button2.setText("");
        gameScreen.button3.setText("");

        nextPosition1 = "village";
        nextPosition2 = "";
        nextPosition3 = "";
        gameScreen.button2.setVisibility(View.INVISIBLE);
        gameScreen.button3.setVisibility(View.INVISIBLE);
    }

    public void village(){
        gameScreen.imageView.setImageResource(R.drawable.village);
        gameScreen.textView1.setText("Thể trạng: "+status);
        gameScreen.textView.setText("Bạn gặp một dân làng bị thương. Người dân làng gục xuống bên cạnh cây cối, tay ôm chặt vết thương trên bụng. Khi nhìn thấy bạn tiến lại, anh ngẩng đầu, giọng run rẩy:\n\nMa Hươu... nó đã tấn công tôi khi tôi vào rừng. Vết thương rất nghiêm trọng. Tôi cần một loại thuốc đặc biệt từ cây rừng để chữa trị, bạn sẽ giúp tôi chứ?");

        showAllButton();

        gameScreen.button1.setText("Giúp đỡ dân làng");
        gameScreen.button2.setText("Không giúp");

        nextPosition1 = "help";
        nextPosition2 = "nohelp";
        nextPosition3 = "";
        gameScreen.button3.setVisibility(View.INVISIBLE);
    }
    public void help(){
        gameScreen.imageView.setImageResource(R.drawable.knife);
        gameScreen.textView1.setText("Thể trạng: "+status);
        gameScreen.textView.setText("Bạn quyết định giúp đỡ và vào rừng tìm loại cây thuốc hiếm. Sau khi chế biến thuốc, bạn quay lại chữa trị vết thương cho người dân làng. Họ cảm kích và tặng bạn một con dao bạc, vũ khí hữu hiệu chống lại Ma Hươu. Bạn cảm thấy may mắn vì món quà này sẽ hỗ trợ bạn trong cuộc chiến sắp tới.");

        knife = true;

        gameScreen.button1.setText(">");
        gameScreen.button2.setText("");
        gameScreen.button3.setText("");

        nextPosition1 = "darkAltar";
        nextPosition2 = "";
        nextPosition3 = "";
        gameScreen.button2.setVisibility(View.INVISIBLE);
        gameScreen.button3.setVisibility(View.INVISIBLE);
    }

    public void nohelp(){
        gameScreen.imageView.setImageResource(R.drawable.dodge);
        gameScreen.textView1.setText("Thể trạng: "+status);
        gameScreen.textView.setText("Bạn mặc kệ người dân làng và tiếp tục bước tới, mặc cho người dân làng cố gắng kêu gọi");

        gameScreen.button1.setText(">");
        gameScreen.button2.setText("");
        gameScreen.button3.setText("");

        nextPosition1 = "darkAltar";
        nextPosition2 = "";
        nextPosition3 = "";
        gameScreen.button2.setVisibility(View.INVISIBLE);
        gameScreen.button3.setVisibility(View.INVISIBLE);
    }

    public void darkAltar(){
        gameScreen.imageView.setImageResource(R.drawable.darkaltar);
        gameScreen.textView1.setText("Thể trạng: "+status);
        gameScreen.textView.setText("Trên đường đi bạn gặp một đền thờ. Bạn đứng trước ba biểu tượng khắc trên cánh cửa đền, đại diện cho sói, cú và nai. Một giọng nói từ bóng tối vang lên:\n\nNgươi đã đến đây vì một lý do. Nhưng để tiếp tục, ngươi phải lựa chọn đúng kẻ săn mồi mạnh nhất trong bóng đêm. Chọn sai, và ngươi sẽ trả giá.");

        showAllButton();

        gameScreen.button1.setText("Biểu tượng của sói");
        gameScreen.button2.setText("Biểu tượng của cú");
        gameScreen.button3.setText("Biểu tượng của nai");

        nextPosition1 = "wolf";
        nextPosition2 = "owl";
        nextPosition3 = "deer";
    }

    public void wolf(){
        gameScreen.imageView.setImageResource(R.drawable.wolf);
        statusNum = 0;
        gameScreen.textView1.setText("Thể trạng: "+status);
        gameScreen.textView.setText("Cánh cửa đền mở ra mà không gặp nguy hiểm, Bạn tiếp tục hành trình");

        gameScreen.button1.setText(">");
        gameScreen.button2.setText("");
        gameScreen.button3.setText("");

        nextPosition1 = "darkDeer";
        nextPosition2 = "";
        nextPosition3 = "";
        gameScreen.button2.setVisibility(View.INVISIBLE);
        gameScreen.button3.setVisibility(View.INVISIBLE);
    }
    public void owl(){
        gameScreen.imageView.setImageResource(R.drawable.owl);
        status = "bị thương nhẹ";
        statusNum = 1;
        gameScreen.textView1.setText("Thể trạng: "+status);
        gameScreen.textView.setText("Một bẫy gai được kích hoạt, khiến bạn bị thương nhẹ.");

        if(postion){

            showAllButton();
            gameScreen.button3.setVisibility(View.INVISIBLE);

            gameScreen.button1.setText("Sử dụng thuốc của Mira");
            gameScreen.button2.setText("Tiếp tục tiến về phía trước");
            gameScreen.button3.setText("");

            nextPosition1 = "recovery";
            nextPosition2 = "darkDeer";
            nextPosition3 = "";
        }
        if(!postion){
            gameScreen.button1.setText("Tiếp tục tiến về phía trước");
            gameScreen.button2.setText("");
            gameScreen.button3.setText("");

            nextPosition1 = "darkDeer";
            nextPosition2 = "";
            nextPosition3 = "";

            gameScreen.button2.setVisibility(View.INVISIBLE);
            gameScreen.button3.setVisibility(View.INVISIBLE);
        }
    }

    public void deer(){
        gameScreen.imageView.setImageResource(R.drawable.deer);
        status = "bị thương nặng";
        statusNum = 2;
        gameScreen.textView1.setText("Thể trạng: "+status);
        gameScreen.textView.setText("Một đàn quái vật liên tục xuất hiện. Bạn buộc phải chiến đấu. Bạn dành chiến thắng nhưng bản thân cũng bị thương nặng");

        if(postion){
            showAllButton();
            gameScreen.button3.setVisibility(View.INVISIBLE);

            gameScreen.button1.setText("Sử dụng thuốc của Mira");
            gameScreen.button2.setText("Tiếp tục tiến về phía trước");
            gameScreen.button3.setText("");

            nextPosition1 = "recovery";
            nextPosition2 = "darkDeer";
            nextPosition3 = "";
        }
        if(!postion){
            gameScreen.button1.setText("Tiếp tục tiến về phía trước");
            gameScreen.button2.setText("");
            gameScreen.button3.setText("");

            nextPosition1 = "darkDeer";
            nextPosition2 = "";
            nextPosition3 = "";

            gameScreen.button2.setVisibility(View.INVISIBLE);
            gameScreen.button3.setVisibility(View.INVISIBLE);
        }
    }

    public void recovery(){
        gameScreen.imageView.setImageResource(R.drawable.strong);
        status = "rất tốt";
        statusNum = 0;
        postion = false;
        gameScreen.textView1.setText("Thể trạng: "+status);
        gameScreen.textView.setText("Bạn sử dụng thuốc Mira ban tặng, cơ thể bạn hồi phục nhanh chóng");

        gameScreen.button1.setText(">");
        gameScreen.button2.setText("");
        gameScreen.button3.setText("");

        nextPosition1 = "darkDeer";
        nextPosition2 = "";
        nextPosition3 = "";
        gameScreen.button2.setVisibility(View.INVISIBLE);
        gameScreen.button3.setVisibility(View.INVISIBLE);
    }

    public void darkDeer(){
        gameScreen.imageView.setImageResource(R.drawable.darkdeer);
        gameScreen.textView1.setText("Thể trạng: "+status);
        gameScreen.textView.setText("Bạn đứng trước Ma Hươu khổng lồ với đôi mắt đỏ rực và sừng sắc bén. Con quái vật gầm lên, sẵn sàng tấn công. Mira quay lại nhìn bạn, nói nhanh và nghiêm túc:\n\nNgươi có thể đánh bại nó, nhưng cách ngươi chiến đấu sẽ quyết định kết quả. Ngươi sẽ chọn phương pháp nào?\"");

        if(knife){
            showAllButton();

            gameScreen.button1.setText("Dùng dao bạc");
            gameScreen.button2.setText("Phóng dao vào mắt");
            gameScreen.button3.setText("Tấn công trực diện");

            nextPosition1 = "useSilverKnife";
            nextPosition2 = "knifeThrow";
            nextPosition3 = "frontalAttack";
        }
        if(!knife){
            showAllButton();
            gameScreen.button3.setVisibility(View.INVISIBLE);

            gameScreen.button1.setText("Phóng dao vào mắt");
            gameScreen.button2.setText("Tấn công trực diện");
            gameScreen.button3.setText("");

            nextPosition1 = "knifeThrow";
            nextPosition2 = "frontalAttack";
            nextPosition3 = "";

        }
    }

    public void useSilverKnife(){
        gameScreen.imageView.setImageResource(R.drawable.knife);
        gameScreen.textView1.setText("Thể trạng: "+status);
        gameScreen.textView.setText("Bạn rút dao bạc từ thắt lưng, vung mạnh vào Ma Hươu. Dao bạc xuyên thủng da quái vật, gây sát thương lớn. Ma Hươu gầm lên đau đớn và nhanh chóng bị tiêu diệt. Bạn nhận được một mảnh vỡ lời nguyền từ thi thể của nó.");

        gameScreen.button1.setText(">");
        gameScreen.button2.setText("");
        gameScreen.button3.setText("");

        nextPosition1 = "artifact";
        nextPosition2 = "";
        nextPosition3 = "";
        gameScreen.button2.setVisibility(View.INVISIBLE);
        gameScreen.button3.setVisibility(View.INVISIBLE);
    }

    public void knifeThrow(){
        gameScreen.imageView.setImageResource(R.drawable.throwknife);
        if(statusNum == 0){
            status = "bị thương nhẹ";
            statusNum = 1;
            gameScreen.textView1.setText("Thể trạng: "+status);
            gameScreen.textView.setText("Kael nhắm đúng mắt của Ma Hươu, phóng dao vào đó. Con quái vật la lên, mất tầm nhìn tạm thời, và trở nên yếu đuối hơn. Với cơ hội này, Kael tiêu diệt Ma Hươu và bị thương nhẹ.");

            gameScreen.button1.setText(">");
            gameScreen.button2.setText("");
            gameScreen.button3.setText("");

            nextPosition1 = "artifact";
            nextPosition2 = "";
            nextPosition3 = "";
            gameScreen.button2.setVisibility(View.INVISIBLE);
            gameScreen.button3.setVisibility(View.INVISIBLE);
        }
        else
            if(statusNum == 1){
            status = "bị thương nặng";
            statusNum = 2;
            gameScreen.textView1.setText("Thể trạng: "+status);
            gameScreen.textView.setText("Kael nhắm đúng mắt của Ma Hươu, phóng dao vào đó. Con quái vật la lên, mất tầm nhìn tạm thời, và trở nên yếu đuối hơn. Với cơ hội này, Kael tiêu diệt Ma Hươu nhưng cũng bị thương nặng.");

            gameScreen.button1.setText(">");
            gameScreen.button2.setText("");
            gameScreen.button3.setText("");

            nextPosition1 = "artifact";
            nextPosition2 = "";
            nextPosition3 = "";
            gameScreen.button2.setVisibility(View.INVISIBLE);
            gameScreen.button3.setVisibility(View.INVISIBLE);
        }
        else {
            status = "";
            gameScreen.textView1.setText("Thể trạng: "+status);
            gameScreen.textView.setText("Kael nhắm đúng mắt của Ma Hươu, phóng dao vào đó. Con quái vật la lên, mất tầm nhìn tạm thời, và trở nên yếu đuối hơn. Bạn đã tận dụng rất tốt điểm yếu của nó, nhưng do vết thương từ trận chiến trước, bạn vẫn không thể chiến thắng được nó.");

            gameScreen.button1.setText(">");
            gameScreen.button2.setText("");
            gameScreen.button3.setText("");

            nextPosition1 = "dead";
            nextPosition2 = "";
            nextPosition3 = "";
            gameScreen.button2.setVisibility(View.INVISIBLE);
            gameScreen.button3.setVisibility(View.INVISIBLE);
        }
    }

    public void frontalAttack(){
        gameScreen.imageView.setImageResource(R.drawable.shield);
        if(statusNum == 0){
            status = "bị thương nặng";
            statusNum  = 2;
            gameScreen.textView1.setText("Thể trạng: "+status);
            gameScreen.textView.setText("Bạn lao vào tấn công trực diện, gây ra những cú đòn mạnh mẽ lên cơ thể Ma Hươu. Tuy nhiên, con quái vật phản công mạnh mẽ, khiến bạn bị thương nặng và mất nhiều sức lực trong cuộc chiến.");

            gameScreen.button1.setText(">");
            gameScreen.button2.setText("");
            gameScreen.button3.setText("");

            nextPosition1 = "artifact";
            nextPosition2 = "";
            nextPosition3 = "";
            gameScreen.button2.setVisibility(View.INVISIBLE);
            gameScreen.button3.setVisibility(View.INVISIBLE);
        }
        else{
            status = "";
            gameScreen.textView1.setText("");
            gameScreen.textView.setText("Bạn lao vào tấn công trực diện, gây ra những cú đòn mạnh mẽ lên cơ thể Ma Hươu. Tuy nhiên, với cơ thể bị thương, bạn không thể chiến thắng được nó.");

            gameScreen.button1.setText(">");
            gameScreen.button2.setText("");
            gameScreen.button3.setText("");

            nextPosition1 = "dead";
            nextPosition2 = "";
            nextPosition3 = "";
            gameScreen.button2.setVisibility(View.INVISIBLE);
            gameScreen.button3.setVisibility(View.INVISIBLE);
        }
    }

    public void artifact(){
        gameScreen.imageView.setImageResource(R.drawable.artifact);
        gameScreen.textView1.setText("Thể trạng: "+status);
        gameScreen.textView.setText("Bạn nhận được một mảnh vỡ lời nguyền và một bình thuốc giúp bạn hồi một phần sinh lực. Bạn chuẩn bị hành trình tiếp theo của mình và tiến vào Hồ Bạc - Argentis");
        if(statusNum == 1 || statusNum == 0){
            status = "rất tốt";
            statusNum = 0;
            gameScreen.textView1.setText("Thể trạng: "+status);
            gameScreen.button1.setText(">");
            gameScreen.button2.setText("");
            gameScreen.button3.setText("");

            nextPosition1 = "argentis";
            nextPosition2 = "";
            nextPosition3 = "";
            gameScreen.button2.setVisibility(View.INVISIBLE);
            gameScreen.button3.setVisibility(View.INVISIBLE);
        }
        else{
            status = "bị thương nhẹ";
            statusNum = 1;
            gameScreen.textView1.setText("Thể trạng: "+status);
            gameScreen.button1.setText(">");
            gameScreen.button2.setText("");
            gameScreen.button3.setText("");

            nextPosition1 = "argentis";
            nextPosition2 = "";
            nextPosition3 = "";
            gameScreen.button2.setVisibility(View.INVISIBLE);
            gameScreen.button3.setVisibility(View.INVISIBLE);
        }
    }

    public void dead(){
        gameScreen.imageView.setImageResource(R.drawable.dead);
        gameScreen.textView1.setText("");
        gameScreen.textView.setText("Bạn đã chết!\n\nGAME OVER!");

        gameScreen.button1.setText("Quay lại màn hình bắt đầu");
        gameScreen.button2.setText("");
        gameScreen.button3.setText("");

        gameScreen.button2.setVisibility(View.INVISIBLE);
        gameScreen.button3.setVisibility(View.INVISIBLE);

        nextPosition1 = "goTitleScreen";
        nextPosition2 = "";
        nextPosition3 = "";
    }

    public void argentis(){
        gameScreen.imageView.setImageResource(R.drawable.river);
        gameScreen.textView1.setText("Thể trạng: "+status);
        gameScreen.textView.setText("Sau khi hạ gục Ma Hươu, bạn tiến vào Hồ Bạc – một nơi huyền bí và u ám, nổi danh với sức mạnh tâm linh kỳ lạ. Tại đây, mảnh vỡ thứ hai của lời nguyền được ẩn giấu, và bạn phải vượt qua những thử thách khắc nghiệt để giành lấy nó.");

        gameScreen.button1.setText(">");
        gameScreen.button2.setText("");
        gameScreen.button3.setText("");

        nextPosition1 = "waterfountain";
        nextPosition2 = "";
        nextPosition3 = "";
        gameScreen.button2.setVisibility(View.INVISIBLE);
        gameScreen.button3.setVisibility(View.INVISIBLE);
    }

    public void waterfountain(){
        gameScreen.imageView.setImageResource(R.drawable.waterfountain);
        gameScreen.textView1.setText("Thể trạng: "+status);
        gameScreen.textView.setText("Bạn đứng trước ba cột nước lớn, mỗi cột tỏa ánh sáng kỳ lạ với ký hiệu cổ khắc sâu. Một giọng nói thần bí vang lên:\n" +"\"Ba cột nước vĩnh cửu, đâu chứa sức mạnh? Hãy chọn khôn ngoan, đừng để bị lừa.\"\n" + "Mira bên cạnh nhắc nhở: \"Cẩn thận, chọn sai sẽ để lại hậu quả khôn lường.\"");

        showAllButton();

        gameScreen.button1.setText("Cột bên trái");
        gameScreen.button2.setText("Cột giữa");
        gameScreen.button3.setText("Cột bên phải");

        nextPosition1 = "left";
        nextPosition2 = "mid";
        nextPosition3 = "right";
    }

    public void left(){
        gameScreen.imageView.setImageResource(R.drawable.dragon);
        gameScreen.textView1.setText("Thể trạng: "+status);
        gameScreen.textView.setText("Bạn quyết định chọn cột bên trái. Ngay khi chạm vào, cột vỡ tung, và Thủy Long xuất hiện. Sinh vật khổng lồ với vảy sáng rực và sức mạnh khủng khiếp lao thẳng về phía bạn, mở màn một trận chiến cam go, đòi hỏi toàn bộ sức lực của bạn.");

        gameScreen.button1.setText(">");
        gameScreen.button2.setText("");
        gameScreen.button3.setText("");

        nextPosition1 = "dragon";
        nextPosition2 = "";
        nextPosition3 = "";

        gameScreen.button2.setVisibility(View.INVISIBLE);
        gameScreen.button3.setVisibility(View.INVISIBLE);
    }

    public void mid(){
        gameScreen.imageView.setImageResource(R.drawable.fragment);
        gameScreen.textView1.setText("Thể trạng: "+status);
        gameScreen.textView.setText("Bạn chọn cột giữa, và kỳ diệu thay, không có nguy hiểm nào xảy ra. Một viên ngọc kỳ diệu xuất hiện, bạn nhận lấy nó mà không cần chiến đấu. Nhưng ngay lúc đó, hồ nước phát sáng xanh mờ đầy bí ẩn, khiến bạn bất an, như thể một mối đe dọa đang ẩn mình trong bóng tối.");

        fragment = true;

        gameScreen.button1.setText("Chiến đấu với thủy long");
        gameScreen.button2.setText("");
        gameScreen.button3.setText("");

        nextPosition1 = "dragon";
        nextPosition2 = "";
        nextPosition3 = "";

        gameScreen.button2.setVisibility(View.INVISIBLE);
        gameScreen.button3.setVisibility(View.INVISIBLE);
    }

    public void right(){
        gameScreen.imageView.setImageResource(R.drawable.firewall);
        if(statusNum == 0 || statusNum == 1) {
            status = "bị thương nặng";
            statusNum = 2;
            gameScreen.textView1.setText("Thể trạng: " + status);
            gameScreen.textView.setText("Bạn chọn cột bên phải. Ngay khi chạm vào, ngọn lửa bùng lên, gây cú sốc nhiệt khiến bạn bị thương nặng. Dù đau đớn và lo lắng, bạn vẫn kiên cường tiến bước, chuẩn bị đối mặt với những thử thách tiếp theo.");

            gameScreen.button1.setText("Chiến đấu với thủy long");
            gameScreen.button2.setText("");
            gameScreen.button3.setText("");

            nextPosition1 = "dragon";
            nextPosition2 = "";
            nextPosition3 = "";

            gameScreen.button2.setVisibility(View.INVISIBLE);
            gameScreen.button3.setVisibility(View.INVISIBLE);
        }
        else{
            gameScreen.imageView.setImageResource(R.drawable.firewall);
            gameScreen.textView1.setText("");
            gameScreen.textView.setText("Bạn chọn cột bên phải. Ngay khi chạm vào, ngọn lửa bùng lên, gây cú sốc nhiệt kèm với vết thương lúc trước.");

            gameScreen.button1.setText(">");
            gameScreen.button2.setText("");
            gameScreen.button3.setText("");

            gameScreen.button2.setVisibility(View.INVISIBLE);
            gameScreen.button3.setVisibility(View.INVISIBLE);

            nextPosition1 = "dead";
            nextPosition2 = "";
            nextPosition3 = "";
        }
    }
    public void dragon() {
        gameScreen.imageView.setImageResource(R.drawable.dragon);
        gameScreen.textView1.setText("Thể trạng: " + status);
        gameScreen.textView.setText("Bạn đối mặt với Thủy Long, một quái vật khổng lồ với thân hình lấp lánh như ngọc, ánh sáng kỳ bí tỏa ra từ vảy. Tiếng gầm vang vọng của nó làm rung chuyển mặt hồ.\n" + "\n" + "Mira lo lắng cảnh báo:\n" + "\"Thủy Long Hồn Ma không dễ đối phó. Hãy chuẩn bị, mỗi quyết định sẽ định đoạt trận chiến.\"");

        if (fragment && !postion){
            showAllButton();
            gameScreen.button1.setText("Dùng viên ngọc kỳ diệu");
            gameScreen.button2.setText("Lao vào tấn công");
            gameScreen.button3.setText("");

            nextPosition1 = "useFragment";
            nextPosition2 = "attack";
            nextPosition3 = "";

            gameScreen.button3.setVisibility(View.INVISIBLE);
        }
        else if (!fragment && !postion){
            gameScreen.button1.setText("Lao vào tấn công");
            gameScreen.button2.setText("");
            gameScreen.button3.setText("");

            nextPosition1 = "attack";
            nextPosition2 = "";
            nextPosition3 = "";

            gameScreen.button2.setVisibility(View.INVISIBLE);
            gameScreen.button3.setVisibility(View.INVISIBLE);
        }
        else if (!fragment && postion) {
            showAllButton();
            gameScreen.button1.setText("Lao vào tấn công");
            gameScreen.button2.setText("Dùng thuốc của Mira");
            gameScreen.button3.setText("");

            nextPosition1 = "attack";
            nextPosition2 = "miraPostion";
            nextPosition3 = "";

            gameScreen.button3.setVisibility(View.INVISIBLE);
        }
        else{
            showAllButton();
            gameScreen.button1.setText("Dùng viên ngọc kỳ diệu");
            gameScreen.button2.setText("Lao vào tấn công");
            gameScreen.button3.setText("Dùng thuốc của Mira");

            nextPosition1 = "useFragment";
            nextPosition2 = "attack";
            nextPosition3 = "miraPostion";
        }
    }
    public void useFragment(){
        gameScreen.imageView.setImageResource(R.drawable.fragment);
        fragment = false;
        status = "rất tốt";
        statusNum = 0;
        gameScreen.textView1.setText("Thể trạng: "+status);
        gameScreen.textView.setText("Viên ngọc ban cho bạn một sức mạnh thần bí và giúp bạn hồi phục mọi vết thương. Bạn chiến thắng một cách dễ dàng");

        gameScreen.button1.setText(">");
        gameScreen.button2.setText("");
        gameScreen.button3.setText("");

        nextPosition1 = "artifact2";
        nextPosition2 = "";
        nextPosition3 = "";
        gameScreen.button2.setVisibility(View.INVISIBLE);
        gameScreen.button3.setVisibility(View.INVISIBLE);
    }
    public void attack(){
        gameScreen.imageView.setImageResource(R.drawable.shield);
        if(statusNum == 0) {
            status = "bị thương nặng";
            statusNum = 2;
            gameScreen.textView1.setText("Thể trạng: " + status);
            gameScreen.textView.setText("Quyết tâm hành động, bạn dồn toàn lực tấn công Thủy Long, gây sát thương lớn khiến nó gào thét đau đớn. Nhưng Thủy Long không dễ bị khuất phục, phản công dữ dội khiến bạn bị thương nặng. Bạn đã tiêu diệt Thủy Long.");

            gameScreen.button1.setText(">");
            gameScreen.button2.setText("");
            gameScreen.button3.setText("");

            nextPosition1 = "artifact2";
            nextPosition2 = "";
            nextPosition3 = "";

            gameScreen.button2.setVisibility(View.INVISIBLE);
            gameScreen.button3.setVisibility(View.INVISIBLE);
        }
        else{
            gameScreen.imageView.setImageResource(R.drawable.dead);
            gameScreen.textView1.setText("");
            gameScreen.textView.setText("Quyết tâm hành động, bạn dồn toàn lực tấn công Thủy Long, gây sát thương lớn khiến nó gào thét đau đớn. Nhưng Thủy Long quá mạnh, nó phản công một cách dữ dội. ");

            gameScreen.button1.setText(">");
            gameScreen.button2.setText("");
            gameScreen.button3.setText("");

            gameScreen.button2.setVisibility(View.INVISIBLE);
            gameScreen.button3.setVisibility(View.INVISIBLE);

            nextPosition1 = "dead";
            nextPosition2 = "";
            nextPosition3 = "";
        }
    }
    public void miraPostion(){
        gameScreen.imageView.setImageResource(R.drawable.postion);
        postion = false;
        status = "bị thương nặng";
        statusNum = 2;
        gameScreen.textView1.setText("Thể trạng: "+status);
        gameScreen.textView.setText("Một trận chiến ác liệt diễn ra. Nhờ sự trợ giúp từ bình thuốc của Mira, bạn cuối cùng cũng đánh bại thủy long nhưng đồng thời bạn cũng bị thương nặng");

        gameScreen.button1.setText(">");
        gameScreen.button2.setText("");
        gameScreen.button3.setText("");

        nextPosition1 = "artifact2";
        nextPosition2 = "";
        nextPosition3 = "";
        gameScreen.button2.setVisibility(View.INVISIBLE);
        gameScreen.button3.setVisibility(View.INVISIBLE);
    }
    public void artifact2() {
        gameScreen.imageView.setImageResource(R.drawable.artifact);
        gameScreen.textView1.setText("Thể trạng: "+status);
        gameScreen.textView.setText("Bạn nhận được thêm một mảnh vỡ lời nguyền và một bình thuốc giúp bạn hồi một phần sinh lực. Bạn chuẩn bị hành trình tiếp theo của mình và tiến vào Thành Trì Tháp Đen - The Black Tower");
        if(statusNum == 1 || statusNum == 0){
            status = "rất tốt";
            statusNum = 0;
            gameScreen.textView1.setText("Thể trạng: "+status);
            gameScreen.button1.setText(">");
            gameScreen.button2.setText("");
            gameScreen.button3.setText("");

            nextPosition1 = "blackTower";
            nextPosition2 = "";
            nextPosition3 = "";
            gameScreen.button2.setVisibility(View.INVISIBLE);
            gameScreen.button3.setVisibility(View.INVISIBLE);
        }
        else{
            status = "bị thương nhẹ";
            statusNum = 1;
            gameScreen.textView1.setText("Thể trạng: "+status);
            gameScreen.button1.setText(">");
            gameScreen.button2.setText("");
            gameScreen.button3.setText("");

            nextPosition1 = "blackTower";
            nextPosition2 = "";
            nextPosition3 = "";
            gameScreen.button2.setVisibility(View.INVISIBLE);
            gameScreen.button3.setVisibility(View.INVISIBLE);
        }
    }
    public void blackTower(){
        gameScreen.imageView.setImageResource(R.drawable.castle);
        gameScreen.textView1.setText("Thể trạng: "+status);
        gameScreen.textView.setText("Sau khi lấy được hai mảnh vỡ, bạn tiến vào Thành Trì Tháp Đen – tòa tháp u ám nằm giữa bóng tối dày đặc và tiếng thì thầm kỳ quái.");

        gameScreen.button1.setText(">");
        gameScreen.button2.setText("");
        gameScreen.button3.setText("");

        nextPosition1 = "door";
        nextPosition2 = "";
        nextPosition3 = "";
        gameScreen.button2.setVisibility(View.INVISIBLE);
        gameScreen.button3.setVisibility(View.INVISIBLE);
    }

    public void door(){
        gameScreen.imageView.setImageResource(R.drawable.castlegate);
        gameScreen.textView1.setText("Thể trạng: "+status);
        gameScreen.textView.setText("Bạn bước vào tháp, nơi bóng tối u ám bao trùm và không khí lạnh lẽo thấm vào từng ngóc ngách cơ thể.\n" + "\n" + "Từ bóng tối sâu thẳm, một giọng nói lạnh lùng vang lên:\n" + "Dark Lord:\n" + "“Ngươi không thể thoát khỏi lời nguyền này. Chiến đấu cũng vô ích, ngươi sẽ không bao giờ hiểu được bản chất thực sự của nó… và sẽ không sống sót để phá vỡ nó.”");

        showAllButton();

        gameScreen.button1.setText("Đối đầu với Dark Lord");
        gameScreen.button2.setText("Tránh chiến đấu");
        gameScreen.button3.setText("");

        nextPosition1 = "darkLord";
        nextPosition2 = "castleRoad";
        nextPosition3 = "";
        gameScreen.button3.setVisibility(View.INVISIBLE);
    }

    public void castleRoad(){
        gameScreen.imageView.setImageResource(R.drawable.castleroad);
        gameScreen.textView1.setText("Thể trạng: "+status);
        gameScreen.textView.setText("Bạn bước vào căn phòng đầy nguy hiểm, nơi một câu đố cổ xưa được bảo vệ bởi các bẫy cơ học tinh vi.\n\n'Trong bóng tối có ánh sáng, nhưng ánh sáng đó sẽ bị tiêu diệt nếu ánh sáng từ ngọn đuốc tắt. Câu hỏi: Điều gì là ánh sáng thực sự?'");

        showAllButton();

        gameScreen.button1.setText("Ngọn lửa của sự thật");
        gameScreen.button2.setText("Ngọn lửa của bóng tối");
        gameScreen.button3.setText("Không giải câu đố và quay lại");

        nextPosition1 = "truthFire";
        nextPosition2 = "darkFire";
        nextPosition3 = "noAnswer";
    }

    public void truthFire(){
        gameScreen.imageView.setImageResource(R.drawable.sword);
        gameScreen.textView1.setText("Thể trạng: "+status);
        gameScreen.textView.setText("Bạn đã đưa ra câu trả lời chính xác, bạn đã nhận được Rune Sword - Vũ khí tiêu diệt Dark Lord");

        sword = true;

        gameScreen.button1.setText(">");
        gameScreen.button2.setText("");
        gameScreen.button3.setText("");

        nextPosition1 = "darkLord";
        nextPosition2 = "";
        nextPosition3 = "";
        gameScreen.button2.setVisibility(View.INVISIBLE);
        gameScreen.button3.setVisibility(View.INVISIBLE);
    }

    public void darkFire(){
        gameScreen.imageView.setImageResource(R.drawable.spiky);
        status = "bị thương nặng";
        statusNum = 2;
        gameScreen.textView1.setText("Thể trạng: "+status);
        gameScreen.textView.setText("Không phải đáp án chính xác. Ngay lập tức, một loạt bẫy gai bật lên, làm bạn bị thương nặng. Dù đau đớn và kiệt sức, bạn vẫn sống sót, nhưng chiến đấu với Dark Lord giờ đây sẽ càng khó khăn hơn.");

        gameScreen.button1.setText(">");
        gameScreen.button2.setText("");
        gameScreen.button3.setText("");

        nextPosition1 = "darkLord";
        nextPosition2 = "";
        nextPosition3 = "";
        gameScreen.button2.setVisibility(View.INVISIBLE);
        gameScreen.button3.setVisibility(View.INVISIBLE);
    }

    public void noAnswer(){
        gameScreen.imageView.setImageResource(R.drawable.castlegate);
        gameScreen.textView1.setText("Thể trạng: "+status);
        gameScreen.textView.setText("Bạn không trả lời câu hỏi và trở lại chiến đấu với Dark Lord");

        gameScreen.button1.setText("darkLord");
        gameScreen.button2.setText("");
        gameScreen.button3.setText("");

        nextPosition1 = "darkLord";
        nextPosition2 = "";
        nextPosition3 = "";
        gameScreen.button2.setVisibility(View.INVISIBLE);
        gameScreen.button3.setVisibility(View.INVISIBLE);
    }

    public void darkLord(){
        gameScreen.imageView.setImageResource(R.drawable.darklord);
        gameScreen.textView1.setText("Thể trạng: " + status);
        gameScreen.textView.setText("Bạn bước vào phòng cuối cùng, nơi trước mắt là Dark Lord – hình bóng đen đặc, đôi mắt cháy lên như lửa hắc ám. Ánh sáng từ những ngọn đuốc chỉ càng làm không gian thêm căng thẳng. Dark Lord đứng đó, tựa như bóng tối sống động, chờ đợi bạn tiến bước.");

        if (sword && postion && fragment){
            showAllButton();
            gameScreen.button1.setText("Sử dụng Rune Sword");
            gameScreen.button2.setText("Sử dụng thuốc và viên ngọc");
            gameScreen.button3.setText("Lao vào tấn công");

            nextPosition1 = "useRuneSword";
            nextPosition2 = "postionFragment";
            nextPosition3 = "attack1";

        }
        else if ((sword &&!fragment) || (sword && !postion)){
            showAllButton();
            gameScreen.button1.setText("Sử dụng Rune Sword");
            gameScreen.button2.setText("Lao vào tấn công");
            gameScreen.button3.setText("");

            nextPosition1 = "useRuneSword";
            nextPosition2 = "attack1";
            nextPosition3 = "";

            gameScreen.button3.setVisibility(View.INVISIBLE);
        }
        else if (!sword && postion && fragment){
            showAllButton();
            gameScreen.button1.setText("Sử dụng thuốc và viên ngọc");
            gameScreen.button2.setText("Lao vào tấn công");
            gameScreen.button3.setText("");

            nextPosition1 = "postionFragment";
            nextPosition2 = "attack1";
            nextPosition3 = "";

            gameScreen.button3.setVisibility(View.INVISIBLE);
        }
        else{
            gameScreen.button1.setText("Lao vào tấn công");
            gameScreen.button2.setText("");
            gameScreen.button3.setText("");

            nextPosition1 = "attack1";
            nextPosition2 = "";
            nextPosition3 = "";

            gameScreen.button2.setVisibility(View.INVISIBLE);
            gameScreen.button3.setVisibility(View.INVISIBLE);
        }
    }

    public void useRuneSword(){
        gameScreen.imageView.setImageResource(R.drawable.sword);
        gameScreen.textView1.setText("Thể trạng: " + status);
        gameScreen.textView.setText("Trận chiến diễn ra ác liệt nhưng với thanh kiếm trong tay, bạn đã tiêu diệt Dark Lord");

        gameScreen.button1.setText(">");
        gameScreen.button2.setText("");
        gameScreen.button3.setText("");

        nextPosition1 = "artifact3";
        nextPosition2 = "";
        nextPosition3 = "";
        gameScreen.button2.setVisibility(View.INVISIBLE);
        gameScreen.button3.setVisibility(View.INVISIBLE);
    }

    public void postionFragment(){
        gameScreen.imageView.setImageResource(R.drawable.postion);
        gameScreen.textView1.setText("Thể trạng: " + status);
        if(statusNum == 1 || statusNum == 0) {
            gameScreen.textView.setText("Bạn sử dụng lọ thuốc và viên ngọc. Nó không chỉ chữa lành vết thương mà còn tăng cường sức mạnh tinh thần, giúp bạn duy trì trong trận chiến dài. Nhờ vậy, bạn có thể chịu đựng được những đòn tấn công của Dark Lord mà không bị suy yếu nhanh chóng. Bạn đã giành chiến thắng");

            gameScreen.button1.setText(">");
            gameScreen.button2.setText("");
            gameScreen.button3.setText("");

            nextPosition1 = "artifact3";
            nextPosition2 = "";
            nextPosition3 = "";
            gameScreen.button2.setVisibility(View.INVISIBLE);
            gameScreen.button3.setVisibility(View.INVISIBLE);
        }
        else{
            gameScreen.textView.setText("Mặc dù đã sử dụng lọ thuốc và viên ngọc có được từ trước đó. Nhưng Dark Lord vẫn quá mạnh so với bạn, bạn đã thất bại trong việc tiêu diệt Dark Lord");

            gameScreen.button1.setText(">");
            gameScreen.button2.setText("");
            gameScreen.button3.setText("");

            nextPosition1 = "dead";
            nextPosition2 = "";
            nextPosition3 = "";
            gameScreen.button2.setVisibility(View.INVISIBLE);
            gameScreen.button3.setVisibility(View.INVISIBLE);
        }
    }
    public void attack1(){
        gameScreen.imageView.setImageResource(R.drawable.shield);
        gameScreen.textView1.setText("Thể trạng: " + status);

        gameScreen.textView.setText("Bạn chọn cách tấn công mạnh mẽ ngay từ đầu, không chút chần chừ. Chiến thuật này giúp bạn gây sát thương lớn lên Dark Lord, nhưng Dark Lord quá mạnh. Hắn đã phản công nhanh chóng và khiến bạn chịu một vết thương chí mạng.");

        gameScreen.button1.setText(">");
        gameScreen.button2.setText("");
        gameScreen.button3.setText("");

        nextPosition1 = "dead";
        nextPosition2 = "";
        nextPosition3 = "";
        gameScreen.button2.setVisibility(View.INVISIBLE);
        gameScreen.button3.setVisibility(View.INVISIBLE);
    }
    public void artifact3(){
        gameScreen.imageView.setImageResource(R.drawable.artifact);
        gameScreen.textView1.setText("");
        gameScreen.textView.setText("Chúc mừng bạn!!!\n\nBạn đã thu thập thành công 3 mảnh vỡ lời nguyền\n\nGiờ đây bạn quyết định sử dụng 3 mảnh vỡ để cứu thành phố Umbra hay bản thân của mình?");

        showAllButton();

        gameScreen.button1.setText("Cứu thành phố Umbra");
        gameScreen.button2.setText("Cứu bản thân");
        gameScreen.button3.setText("");

        nextPosition1 = "saveUmbra";
        nextPosition2 = "saveYourSelf";
        nextPosition3 = "";
        gameScreen.button3.setVisibility(View.INVISIBLE);
    }

    public void saveUmbra(){
        gameScreen.imageView.setImageResource(R.drawable.deadend);
        gameScreen.textView1.setText("");
        gameScreen.textView.setText("Bạn thành công phá vỡ lời nguyền và thành phố Umbra được giải thoát khỏi bóng tối. Bạn trở thành người hùng trong thành phố, nhưng trong lòng vẫn mang dấu vết của lời nguyền. Bạn đã chết và được mọi người tưởng nhớ.\n\nCHÚC MỪNG!!!!");

        gameScreen.button1.setText("Quay lại màn hình bắt đầu");
        gameScreen.button2.setText("");
        gameScreen.button3.setText("");

        nextPosition1 = "goTitleScreen";
        nextPosition2 = "";
        nextPosition3 = "";
        gameScreen.button2.setVisibility(View.INVISIBLE);
        gameScreen.button3.setVisibility(View.INVISIBLE);
    }

    public void saveYourSelf(){
        gameScreen.imageView.setImageResource(R.drawable.endlife);
        gameScreen.textView1.setText("");
        gameScreen.textView.setText("Bạn từ bỏ hành trình và quay về cuộc sống yên bình, nhưng lời nguyền vẫn ám ảnh thành phố Umbra, khiến nó tiếp tục chìm trong bóng tối. Bạn sống trong nỗi đau, không thể thay đổi số phận, giải thoát thành phố hay thoát khỏi lời nguyền đã gắn liền với mình..\n\nCHÚC MỪNG!!!!");

        gameScreen.button1.setText("Quay lại màn hình bắt đầu");
        gameScreen.button2.setText("");
        gameScreen.button3.setText("");

        nextPosition1 = "goTitleScreen";
        nextPosition2 = "";
        nextPosition3 = "";
        gameScreen.button2.setVisibility(View.INVISIBLE);
        gameScreen.button3.setVisibility(View.INVISIBLE);
    }
}
