package Sand.MVC;

public class MVCNotes {



    /* the following is how we do MVC, per the lecture.


         mvc is **loose coupling** based
         insofar its practical

     Model is beans

        model is responsible for data and **SOMETIMES** data manipulation && logic
        you should have 2 model, business model and data model
        business model handles business logic

            ===================//
               ENCAPSULATION:
            ===================//


             ENTITY - singular object (department, employee, manager, etc.)
             often reflects database tables
             NOT join tables


             BEAN - an entity in java
             provides zero argument constructor, has getters and setters for all    instance variables, implements SERIALIZABLE and EXTERNALIZABLE interface
             does not perform any complex logic -- just getters and setters
             libaries can be built around beans
             all entities in codeup will be written as beans


            JAVA BEAN example (based on employee table):
                 *make new java class called EmployeeBean
                    ** beans use zero-arg constructors


                ======JAVA BEAN========
                    **make attributes private
                 private long empNo;
                 private String bday;
                 private String firstName;
                 private String lastName;
                 private char gender;
                 priavte String hireDate
                    ** make getters for all private attr
                 public void getEmpNo(long empNo) {
                         return empNo
                 }
                     ...etc for all the attr
                 public EmployeeBean() {}

                ============END BEAN=========


             DAO CLASS THAT ALLOW BUSINESS MODEL TO ACCESS DATA MODEL
             considered bad form to access bean from controller


               ===============DAO INTERFACE==========================
                 public interface Ads {     *Ads class is actually a bean
                    List<Ad> all();    *find all ads records
                    Ad findOne(long id); *find individual record by id
                    void insert(Ad ad);  *insert new record
                    void update(Ad ad);  *update existing record
                    void destroy(Ad ad);  *remove record
               ==============END DAO INTERFACE=======================


                useful in combination with a FACTORY: a class for creating objects.
                    use FACTORY to create instances of DAO for us and reuse instances.
                    also how rest of application can gain access to DAO's.


                    ==============FACTORY============
                     public class DaoFactory {
                        priavte static Ads adsDao;
                        public static Ads getAdsDao() {
                            if (adsDao == null) {
                                adsDao = new MySQLAdsDao();
                        }
                        return adsDao;
                        }
                       ===============END FACTORY======

                       ^^ this allows you to access dao from anywhere


         ===============================DAO EXAMPLE ===========================
                        ____________
                        ----BEAN---- (put this in model)
                        ------------
--------------------------------------------------------------------------------------
        ****REMEMBER: beans have fields and constructors****
        public class ProductBean{
            private String name;
            private Double price;

            ***zero arg consturctor:
            public ProductBean() {
                ***...getters and setters here
            }
--------------------------------------------------------------------------------------
                        ____________
                        --END BEAN--
                        -------------


                        ___________
                        -INTERFACE- (put this in model)
                        -----------
 ------------------------------------------------------------------------------------

        public interfacte ProductsInterface{
            //define methods
            List<Product> listAllProducts();
            void insert(Product product);
            }

                        -----------------------------------------------------------------------------------
                        ___________
                        ----END----
                        -----------

                        ________________
                        -IMPLEMENTATION-
                        ----------------

        public class ProductImp implements ProductsInterface{
            @Override
            public void insert(ProductBean product) {

            }

            @Override
            public List<Products> listAllProducts() {
            //mocking database using ArrayList
            private List<Product> product_db = new ArrayList();

            }



        }

                        ___________
                        ----END----
                        -----------


               */




    // View is jsp files
        //ONLY PRESENTATION
        //handles the presentation


    // Controller is servlets
        //where you respond to user actions, LOGIC, data manipulation
        //user authentication is probably here, or in model

            //use request and response methods to send to jsp


            //setAttribute
                // request side function
                // request.setAttribute("value", name)
                    // request.setAttribute("theNumber", 42)

            //getRequestDispatcher
                // sends info to other page
                // passes the flow of control from servlet to JSP or wherever
                // it does not stop the method, so it has to be at the very last line
                // of the method, otherwise the SERVER WILL CRASH
                // (same with sendRedirect)








}
