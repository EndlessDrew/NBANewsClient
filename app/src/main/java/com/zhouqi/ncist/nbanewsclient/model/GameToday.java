package com.zhouqi.ncist.nbanewsclient.model;

import java.util.List;

/**
 * Created by z on 2017/1/20.
 */

public class GameToday {

    /**
     * reason : success
     * result : [{"match_id":"150267","time":"2016-01-20 08:30:00","home":{"id":"2","shortcut":"Heat","forum":"77","name":"热火","fullname":"迈阿密热火","logo":"http://c2.hoopchina.com.cn//images/gamespace/team/MIA.png","score":"79","link":"https://nba.hupu.com/teams/heat"},"away":{"id":"13","shortcut":"Bucks","forum":"110","name":"雄鹿","fullname":"密尔沃基雄鹿","logo":"http://c2.hoopchina.com.cn//images/gamespace/team/http://c2.hoopchina.com.cn//images/gamespace/team/MIA.png","score":"91","link":"https://nba.hupu.com/teams/bucks"},"stadium_id":25,"stadium_name":"美国航空球馆","game_time":"2:9","process":"第四节结束","textlive_link":"https://nba.hupu.com/games/playbyplay/150267","boxscore_link":"https://nba.hupu.com/games/boxscore/150267","recap_title":"雄鹿多点开花客场灭热火","recap_link":"https://nba.hupu.com/games/recap/150267","pics_link":"","video_link":"http://v.opahnet.com/nba/v790647.html","status":"1","match_time":"4,0:0.0","match_type":"REGULAR","attendance":"19886","home_win":0,"away_win":0,"season":2015},{"match_id":"150268","time":"2016-01-20 09:00:00","home":{"id":"14","shortcut":"Pelicans","forum":"89","name":"鹈鹕","fullname":"新奥尔良鹈鹕","logo":"http://c2.hoopchina.com.cn//images/gamespace/team/NOH.png","score":"114","link":"https://nba.hupu.com/teams/pelicans"},"away":{"id":"20","shortcut":"Timberwolves","forum":"76","name":"森林狼","fullname":"明尼苏达森林狼","logo":"http://c2.hoopchina.com.cn//images/gamespace/team/http://c2.hoopchina.com.cn//images/gamespace/team/NOH.png","score":"99","link":"https://nba.hupu.com/teams/timberwolves"},"stadium_id":16,"stadium_name":"冰沙王中心","game_time":"2:17","process":"第四节结束","textlive_link":"https://nba.hupu.com/games/playbyplay/150268","boxscore_link":"https://nba.hupu.com/games/boxscore/150268","recap_title":"戴维斯35分逆转胜森林狼","recap_link":"https://nba.hupu.com/games/recap/150268","pics_link":"","video_link":"http://v.opahnet.com/nba/v790633.html","status":"1","match_time":"4,0:0.0","match_type":"REGULAR","attendance":"14255","home_win":0,"away_win":0,"season":2015},{"match_id":"150269","time":"2016-01-20 10:00:00","home":{"id":"17","shortcut":"Nuggets","forum":"72","name":"掘金","fullname":"丹佛掘金","logo":"http://c2.hoopchina.com.cn//images/gamespace/team/DEN.png","score":"104","link":"https://nba.hupu.com/teams/nuggets"},"away":{"id":"27","shortcut":"Thunder","forum":"108","name":"雷霆","fullname":"俄克拉荷马城雷霆","logo":"http://c2.hoopchina.com.cn//images/gamespace/team/http://c2.hoopchina.com.cn//images/gamespace/team/DEN.png","score":"110","link":"https://nba.hupu.com/teams/thunder"},"stadium_id":7,"stadium_name":"百事中心","game_time":"2:25","process":"第四节结束","textlive_link":"https://nba.hupu.com/games/playbyplay/150269","boxscore_link":"https://nba.hupu.com/games/boxscore/150269","recap_title":"杜兰特30+12小胜掘金队","recap_link":"https://nba.hupu.com/games/recap/150269","pics_link":"","video_link":"http://v.opahnet.com/nba/v790677.html","status":"1","match_time":"4,0:0.0","match_type":"REGULAR","attendance":"12844","home_win":0,"away_win":0,"season":2015},{"match_id":"150270","time":"2016-01-20 10:00:00","home":{"id":"26","shortcut":"Suns","forum":"71","name":"太阳","fullname":"菲尼克斯太阳","logo":"http://c2.hoopchina.com.cn//images/gamespace/team/PHX.png","score":"94","link":"https://nba.hupu.com/teams/suns"},"away":{"id":"12","shortcut":"Pacers","forum":"74","name":"步行者","fullname":"印第安纳步行者","logo":"http://c2.hoopchina.com.cn//images/gamespace/team/http://c2.hoopchina.com.cn//images/gamespace/team/PHX.png","score":"97","link":"https://nba.hupu.com/teams/pacers"},"stadium_id":19,"stadium_name":"托金斯迪克度假酒店球馆","game_time":"2:26","process":"第四节结束","textlive_link":"https://nba.hupu.com/games/playbyplay/150270","boxscore_link":"https://nba.hupu.com/games/boxscore/150270","recap_title":"乔治19+8小胜太阳止连败","recap_link":"https://nba.hupu.com/games/recap/150270","pics_link":"","video_link":"http://v.opahnet.com/nba/v790658.html","status":"1","match_time":"4,0:0.0","match_type":"REGULAR","attendance":"16802","home_win":0,"away_win":0,"season":2015}]
     * error_code : 0
     */

    private String reason;
    private int error_code;
    private List<ResultBean> result;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * match_id : 150267
         * time : 2016-01-20 08:30:00
         * home : {"id":"2","shortcut":"Heat","forum":"77","name":"热火","fullname":"迈阿密热火","logo":"http://c2.hoopchina.com.cn//images/gamespace/team/MIA.png","score":"79","link":"https://nba.hupu.com/teams/heat"}
         * away : {"id":"13","shortcut":"Bucks","forum":"110","name":"雄鹿","fullname":"密尔沃基雄鹿","logo":"http://c2.hoopchina.com.cn//images/gamespace/team/http://c2.hoopchina.com.cn//images/gamespace/team/MIA.png","score":"91","link":"https://nba.hupu.com/teams/bucks"}
         * stadium_id : 25
         * stadium_name : 美国航空球馆
         * game_time : 2:9
         * process : 第四节结束
         * textlive_link : https://nba.hupu.com/games/playbyplay/150267
         * boxscore_link : https://nba.hupu.com/games/boxscore/150267
         * recap_title : 雄鹿多点开花客场灭热火
         * recap_link : https://nba.hupu.com/games/recap/150267
         * pics_link :
         * video_link : http://v.opahnet.com/nba/v790647.html
         * status : 1
         * match_time : 4,0:0.0
         * match_type : REGULAR
         * attendance : 19886
         * home_win : 0
         * away_win : 0
         * season : 2015
         */

        private String match_id;
        private String time;
        private HomeBean home;
        private AwayBean away;
        private int stadium_id;
        private String stadium_name;
        private String game_time;
        private String process;
        private String textlive_link;
        private String boxscore_link;
        private String recap_title;
        private String recap_link;
        private String pics_link;
        private String video_link;
        private String status;
        private String match_time;
        private String match_type;
        private String attendance;
        private int home_win;
        private int away_win;
        private int season;

        public String getMatch_id() {
            return match_id;
        }

        public void setMatch_id(String match_id) {
            this.match_id = match_id;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public HomeBean getHome() {
            return home;
        }

        public void setHome(HomeBean home) {
            this.home = home;
        }

        public AwayBean getAway() {
            return away;
        }

        public void setAway(AwayBean away) {
            this.away = away;
        }

        public int getStadium_id() {
            return stadium_id;
        }

        public void setStadium_id(int stadium_id) {
            this.stadium_id = stadium_id;
        }

        public String getStadium_name() {
            return stadium_name;
        }

        public void setStadium_name(String stadium_name) {
            this.stadium_name = stadium_name;
        }

        public String getGame_time() {
            return game_time;
        }

        public void setGame_time(String game_time) {
            this.game_time = game_time;
        }

        public String getProcess() {
            return process;
        }

        public void setProcess(String process) {
            this.process = process;
        }

        public String getTextlive_link() {
            return textlive_link;
        }

        public void setTextlive_link(String textlive_link) {
            this.textlive_link = textlive_link;
        }

        public String getBoxscore_link() {
            return boxscore_link;
        }

        public void setBoxscore_link(String boxscore_link) {
            this.boxscore_link = boxscore_link;
        }

        public String getRecap_title() {
            return recap_title;
        }

        public void setRecap_title(String recap_title) {
            this.recap_title = recap_title;
        }

        public String getRecap_link() {
            return recap_link;
        }

        public void setRecap_link(String recap_link) {
            this.recap_link = recap_link;
        }

        public String getPics_link() {
            return pics_link;
        }

        public void setPics_link(String pics_link) {
            this.pics_link = pics_link;
        }

        public String getVideo_link() {
            return video_link;
        }

        public void setVideo_link(String video_link) {
            this.video_link = video_link;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getMatch_time() {
            return match_time;
        }

        public void setMatch_time(String match_time) {
            this.match_time = match_time;
        }

        public String getMatch_type() {
            return match_type;
        }

        public void setMatch_type(String match_type) {
            this.match_type = match_type;
        }

        public String getAttendance() {
            return attendance;
        }

        public void setAttendance(String attendance) {
            this.attendance = attendance;
        }

        public int getHome_win() {
            return home_win;
        }

        public void setHome_win(int home_win) {
            this.home_win = home_win;
        }

        public int getAway_win() {
            return away_win;
        }

        public void setAway_win(int away_win) {
            this.away_win = away_win;
        }

        public int getSeason() {
            return season;
        }

        public void setSeason(int season) {
            this.season = season;
        }

        public static class HomeBean {
            /**
             * id : 2
             * shortcut : Heat
             * forum : 77
             * name : 热火
             * fullname : 迈阿密热火
             * logo : http://c2.hoopchina.com.cn//images/gamespace/team/MIA.png
             * score : 79
             * link : https://nba.hupu.com/teams/heat
             */

            private String id;
            private String shortcut;
            private String forum;
            private String name;
            private String fullname;
            private String logo;
            private String score;
            private String link;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getShortcut() {
                return shortcut;
            }

            public void setShortcut(String shortcut) {
                this.shortcut = shortcut;
            }

            public String getForum() {
                return forum;
            }

            public void setForum(String forum) {
                this.forum = forum;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getFullname() {
                return fullname;
            }

            public void setFullname(String fullname) {
                this.fullname = fullname;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getScore() {
                return score;
            }

            public void setScore(String score) {
                this.score = score;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }
        }

        public static class AwayBean {
            /**
             * id : 13
             * shortcut : Bucks
             * forum : 110
             * name : 雄鹿
             * fullname : 密尔沃基雄鹿
             * logo : http://c2.hoopchina.com.cn//images/gamespace/team/http://c2.hoopchina.com.cn//images/gamespace/team/MIA.png
             * score : 91
             * link : https://nba.hupu.com/teams/bucks
             */

            private String id;
            private String shortcut;
            private String forum;
            private String name;
            private String fullname;
            private String logo;
            private String score;
            private String link;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getShortcut() {
                return shortcut;
            }

            public void setShortcut(String shortcut) {
                this.shortcut = shortcut;
            }

            public String getForum() {
                return forum;
            }

            public void setForum(String forum) {
                this.forum = forum;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getFullname() {
                return fullname;
            }

            public void setFullname(String fullname) {
                this.fullname = fullname;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getScore() {
                return score;
            }

            public void setScore(String score) {
                this.score = score;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }
        }
    }
}
