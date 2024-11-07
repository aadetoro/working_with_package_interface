package ecommerce;

    public abstract class AbstractEntity {
        private Long id;
        private Long refNumber;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getRefNumber() {
            return refNumber;
        }

        public void setRefNumber(Long refNumber) {
            this.refNumber = refNumber;
        }
    }

