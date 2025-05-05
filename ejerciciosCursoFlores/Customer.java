package duke.choice;
    public class Customer{
        String nombre;
        String talle;

        private Clothing [] items;

        public Customer(String name, int medida) {
            this.nombre = name;
            setSize(medida);
        }

        public void agregarItems(Clothing[] itemss){
            items = itemss;
        }
        public Clothing[] getItems(){
            return items;
        }

        double total= 0.0;

        public double totalRopa(){
            for (Clothing item: items){

                total =total+ item.getPrecio();
                System.out.println("Descripción del producto: "+
                        item.descripcion+" Precio del producto: "+item.precio+" Talle del producto: "+item.talle);
            }
            return total;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nom) {
            this.nombre = nom;
        }

        public String getSize() {
            return talle;
        }

        public void setSize(String size) {
            this.talle = size;
        }

        public void setSize(int measurement) {
            switch (measurement) {
                case 1:
                case 2:
                case 3:
                    talle = "S";
                    break;
                case 4:
                case 5:
                case 6:
                    talle = "M";
                    break;
                case 7:
                case 8:
                case 9:
                    talle = "L";
                    break;
                default:
                    talle = "X";
            }
        }
    }
