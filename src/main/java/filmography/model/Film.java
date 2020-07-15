package filmography.model;

import javax.persistence.*;

    @Entity
    @Table(name = "films")
    public class Film{
        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        @Column (name = "title")
        private String  title;
        @Column (name = "year")
        private int year;
        @Column(name = "genre")
        private boolean watched;

        //+getter and setter
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public boolean isWatched() {
            return watched;
        }

        public void setWatched(boolean watched) {
            this.watched = watched;
        }
    }

