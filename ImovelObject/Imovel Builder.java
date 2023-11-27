public static class ImovelBuilder {
        private int codigo;
        private float valor;
        private String status;
        private String foto;
        private String rua;
        private String bairro;
        private int numero;
        private int nota;
        private int cpfProprietario;

        public ImovelBuilder codigo(int codigo) {
            this.codigo = codigo;
            return this;
        }

        public ImovelBuilder valor(float valor) {
            this.valor = valor;
            return this;
        }

        public ImovelBuilder status(String status) {
            this.status = status;
            return this;
        }

        public ImovelBuilder foto(String foto) {
            this.foto = foto;
            return this;
        }

        public ImovelBuilder rua(String rua) {
            this.rua = rua;
            return this;
        }

        public ImovelBuilder bairro(String bairro) {
            this.bairro = bairro;
            return this;
        }

        public ImovelBuilder numero(int numero) {
            this.numero = numero;
            return this;
        }

        public ImovelBuilder nota(int nota) {
            this.nota = nota;
            return this;
        }

        public ImovelBuilder cpfProprietario(int cpfProprietario) {
            this.cpfProprietario = cpfProprietario;
            return this;
        }

        public Imovel build() {
            return new Imovel(this);
        }
    }