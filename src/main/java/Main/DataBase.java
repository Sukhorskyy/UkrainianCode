package Main;

import UkrainianCode.БазаДаних;

public class DataBase extends БазаДаних {
    public String getUserData() {
        return super.отриматиДаніКористувача();
    }
    public String getStatisticData() {
        return super.отриматиСтатистичніДані();
    }
}
