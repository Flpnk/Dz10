public class Radio {
    private int curretStation;
    private int currentVolume;

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume -1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume +1;
        }
    }

    public void next() {
        if (curretStation != 9) {
            curretStation++;
            return;
        }
            curretStation = 0;
        }

    public void prev() {
        if (curretStation !=0) {
            curretStation--;
        } else {
            curretStation = 9;
        }
    }

    public int getCurretStation() {
        return curretStation;
    }

    public void setCurretStation(int curretStation) {
        if (curretStation < 0) {
            return;
        }
        if (curretStation > 9) {
            return;
        }
        this.curretStation = curretStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}
