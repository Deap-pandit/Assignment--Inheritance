
    public class WorldClock extends Clock {
        int timezone = 0;
        public WorldClock(int timezone){
            super();
            this.timezone = timezone;

        }
        public String getHours(){
            String hours= String.valueOf(Integer.parseInt(super.getHours())+timezone);
            return hours;

        }


    }


