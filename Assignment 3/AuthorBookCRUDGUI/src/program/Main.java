/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import entity.*;
import java.util.List;
import java.util.Optional;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/**
 *
 * @author Jefferson
 */
public class Main extends javax.swing.JFrame {
    private static DAO authorDAO; // DAO of Author
    private static DAO bookDAO; // DAO of Book
    /**
     * Creates new form Main
     */
    public Main() {
        super ("AuthorBook CRUD Application"); // Renames the application name
        initComponents();
        refreshAuthorsTable();              // Updates Author table with current information in the database
        refreshBooksTable();                // Updates Book table with current information in teh database
        authorIDLabel.setVisible(false);    //Set all componenets of the GUI to be not visible
        firstNameLabel.setVisible(false);   
        lastNameLabel.setVisible(false);    // Only componenets visible are the tables, headers, and radio buttons for selection
        textID.setVisible(false);
        textFirstName.setVisible(false);
        textLastName.setVisible(false);
        insertAuthor.setVisible(false);
        updateAuthor.setVisible(false);
        deleteAuthor.setVisible(false);
        updateBook.setVisible(false);
        deleteBook.setVisible(false);
        bookISBNLabel.setVisible(false);
        titleLabel.setVisible(false);
        authorIDBLabel.setVisible(false);
        textISBN.setVisible(false);
        textTitle.setVisible(false);
        textAuthorID.setVisible(false);
        insertBook.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        authorIDLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        textID = new javax.swing.JTextField();
        textFirstName = new javax.swing.JTextField();
        textLastName = new javax.swing.JTextField();
        insertAuthor = new javax.swing.JButton();
        updateAuthor = new javax.swing.JButton();
        deleteAuthor = new javax.swing.JButton();
        tableHeader = new javax.swing.JLabel();
        updateBook = new javax.swing.JButton();
        deleteBook = new javax.swing.JButton();
        bookISBNLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        authorIDBLabel = new javax.swing.JLabel();
        textISBN = new javax.swing.JTextField();
        textTitle = new javax.swing.JTextField();
        textAuthorID = new javax.swing.JTextField();
        insertBook = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        authorTable = new javax.swing.JTable();
        header = new javax.swing.JLabel();
        authorButton = new javax.swing.JRadioButton();
        bookButton = new javax.swing.JRadioButton();
        status = new javax.swing.JLabel();
        message = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        authorIDLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        authorIDLabel.setText("Author ID");
        getContentPane().add(authorIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        firstNameLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        firstNameLabel.setText("First Name");
        getContentPane().add(firstNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        lastNameLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lastNameLabel.setText("Last Name");
        getContentPane().add(lastNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        textID.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(textID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 157, -1));

        textFirstName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(textFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 157, -1));

        textLastName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(textLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 157, -1));

        insertAuthor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        insertAuthor.setText("Insert");
        insertAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertAuthorActionPerformed(evt);
            }
        });
        getContentPane().add(insertAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        updateAuthor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        updateAuthor.setText("Update");
        updateAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAuthorActionPerformed(evt);
            }
        });
        getContentPane().add(updateAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        deleteAuthor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        deleteAuthor.setText("Delete");
        deleteAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAuthorActionPerformed(evt);
            }
        });
        getContentPane().add(deleteAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, -1));

        tableHeader.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        tableHeader.setText("Database Access Program");
        getContentPane().add(tableHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 290, -1));

        updateBook.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        updateBook.setText("Update");
        updateBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBookActionPerformed(evt);
            }
        });
        getContentPane().add(updateBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        deleteBook.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        deleteBook.setText("Delete");
        deleteBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBookActionPerformed(evt);
            }
        });
        getContentPane().add(deleteBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, -1));

        bookISBNLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        bookISBNLabel.setText("Book ISBN");
        getContentPane().add(bookISBNLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        titleLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        titleLabel.setText("Title");
        getContentPane().add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        authorIDBLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        authorIDBLabel.setText("Author ID");
        getContentPane().add(authorIDBLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        textISBN.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(textISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 157, -1));

        textTitle.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(textTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 157, -1));

        textAuthorID.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(textAuthorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 157, -1));

        insertBook.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        insertBook.setText("Insert");
        insertBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBookActionPerformed(evt);
            }
        });
        getContentPane().add(insertBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ISBN", "Book Title", "Author ID"
            }
        ));
        bookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(bookTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 400, 250));

        authorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Author ID", "First Name", "Last Name"
            }
        ));
        authorTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                authorTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(authorTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 400, 250));

        header.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        header.setText("Application Running....");
        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        buttonGroup1.add(authorButton);
        authorButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        authorButton.setText("Author Table Access");
        authorButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                authorButtonItemStateChanged(evt);
            }
        });
        getContentPane().add(authorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        buttonGroup1.add(bookButton);
        bookButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        bookButton.setText("Book Table Access");
        bookButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                bookButtonItemStateChanged(evt);
            }
        });
        getContentPane().add(bookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        status.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        status.setText("Status:");
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 280, 30));
        getContentPane().add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 290, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertAuthorActionPerformed
        if (!textID.getText().isEmpty()) { // Checks if the textID field is empty, if empty, can enter information
            int authorID = Integer.parseInt(textID.getText().trim()); // Gets the user input for the author ID
            String firstName = textFirstName.getText().trim(); // Gets the user input for the first name
            String lastName = textLastName.getText().trim(); // Gets the user input for the last name
            Author author = getAuthor(authorID); // Creates Author object to use getAuthor method to get the author ID
            if(author.getAuthorID() != -1) { // Checks if the author id already exist
                alert("Author already exist under that ID", "Primary Key violation"); // If yes, gives alert message of a primary key violation
            }
            else
            {
                addAuthor(authorID, firstName, lastName); // If no errors, adds the author into the database
                refreshAuthorsTable(); // Updates the author table with the new author
                clearAuthorTextFields(); // Resets and clears the text entry fields 
                message.setText("A new author was inserted successfully!"); // Message updater
            }
        }
        else{ // If textID field is still empty, alert message is given
            alert("AuthorID cannot be empty", "Insert error"); // The insert error message
        }     
    }
        
        
        // method to show an info alert
        public void alert(String msg) {
        JOptionPane.showMessageDialog(rootPane, msg);
    }
        // method to show an error alert
        public void alert(String msg, String title) {
        JOptionPane.showMessageDialog(rootPane, msg, title, JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_insertAuthorActionPerformed

    private void updateAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAuthorActionPerformed
        if (!textID.getText().isEmpty()) { // Checks if the textID field is empty, if empty, can enter information
            int authorID = Integer.parseInt(textID.getText().trim()); // Gets the user input for the author ID
            String firstName = textFirstName.getText().trim(); // Gets the user input for the first name
            String lastName = textLastName.getText().trim(); // Gets the user input for the last name
            Author author = getAuthor(authorID); // Creates Author object to use getAuthor method to get the author ID
            if(author.getAuthorID() != -1) { // Checks if the author id already exist
                updateAuthor(authorID, firstName, lastName); // Update author method is ran and updates the author information
                refreshAuthorsTable(); // Updates the author table with new information
                clearAuthorTextFields(); // Resets and clears the text entry fields
                message.setText("An existing author was updated successfully!"); // Message updater
            }
            else
            {   // If author does not exist already, cannot be updated and gives alert message
                alert("Author does not exist", "Update error"); // The update error message
            }
        }
        else
        {   // If textID field is still empty, alert message is given
            alert("AuthorID cannot be empty", "Update error"); // The update error message
        }
    }//GEN-LAST:event_updateAuthorActionPerformed

    private void deleteAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAuthorActionPerformed
        alert("Author cannnot be deleted unless author's books are deleted first");
        if (!textID.getText().isEmpty()) { // Checks if the textID field is empty, if empty, can enter information
            int authorID = Integer.parseInt(textID.getText().trim()); // Gets the user input for the author ID
            Author author = getAuthor(authorID); // Creates Author object to use getAuthor method to get the author ID
            if(author.getAuthorID() != -1) { // Checks if the author id already exist
                int option = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to Delete?", "Delete confirmation", JOptionPane.YES_NO_OPTION); // Option pane to confirm deletion
                if(option == 0) { // If option is yes 
                    deleteAuthor(authorID); // Deletes the author from database
                    refreshAuthorsTable(); // Updates the author table with the new author table information 
                    clearAuthorTextFields(); // Resets and clears the text entry fields
                    message.setText("A author was deleted successfully!"); // Message updater
                }
            }
            else
            {   // If author does not exist already, cannot be deleted and gives alert message
                alert("Author does not exist", "Delete error"); // The delete error message
            }
        }
        else
        {   // If textID field is still empty, alert message is given
            alert("AuthorID cannot be empty", "Delete error"); // The delete error message
        }
    }//GEN-LAST:event_deleteAuthorActionPerformed

    private void authorTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_authorTableMouseClicked
        int i = authorTable.getSelectedRow(); // Gets the selected row and saves it as int i
        TableModel model = authorTable.getModel(); // Creates tablemodel object to use getModel method for authorTable
        textID.setText(model.getValueAt(i, 0).toString()); // Enters selected author ID into textID text field
        textFirstName.setText(model.getValueAt(i, 1).toString()); // Enters selected author first name into textFirstName text field
        textLastName.setText(model.getValueAt(i, 2).toString()); // Enters selected author last name into textLastName text field
    }//GEN-LAST:event_authorTableMouseClicked

    private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTableMouseClicked
        int i = bookTable.getSelectedRow(); // Gets the selected row and saves it as int i
        TableModel model = bookTable.getModel(); // Creates tablemodel object to use getModel method for bookTable
        textISBN.setText(model.getValueAt(i, 0).toString()); // Enters selected book ISBN into textISBN text field
        textTitle.setText(model.getValueAt(i, 1).toString()); // Enters selected book title into textTitle text field
        textAuthorID.setText(model.getValueAt(i, 2).toString()); // Enters selected book authorID into textAuthorID text field
    }//GEN-LAST:event_bookTableMouseClicked

    private void updateBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBookActionPerformed
        if (textAuthorID.getText().isEmpty()) { // If authorID field is left empty...
            alert("AuthorID cannot be empty", "Update error"); // alert message is given
        }
        else{
            if (!textISBN.getText().isEmpty()) { // // Checks if the textISBN field is empty, if empty, can enter information
                int isbn = Integer.parseInt(textISBN.getText().trim()); // Gets the user input for the book ISBN
                String title = textTitle.getText().trim(); // Gets the user input for the title
                int authorID = Integer.parseInt(textAuthorID.getText().trim()); // Gets the user input for the author ID
                Book book = getBook(isbn); // Creates Book object to use getBook method to get the ISBN
                if(book.getISBN() != -1) { // Checks if the book isbn already exist
                    updateBook(isbn, title, authorID); // Update book method is ran and updates the book information
                    refreshBooksTable(); // Updates the book table with new informaiton
                    clearBookTextFields(); // Resets and clears the text entry fields
                    message.setText("An existing book was updated successfully!"); // Message updater
                }
                else
                {   // If book does not exist already, cannot be updated and givse alert message
                    alert("Book does not exist", "Update error"); // Update error message
                }
            }
            else
            {   // If textISBN field is still empty, alert message is given
                alert("ISBN cannot be empty", "Update error"); // Update error message
            }   
        }
    }//GEN-LAST:event_updateBookActionPerformed

    private void deleteBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBookActionPerformed
        if (textAuthorID.getText().isEmpty()) { // If authorID field is left empty...
            alert("AuthorID cannot be empty", "Delete error"); // alert message is given
        }
        else{
            if (!textISBN.getText().isEmpty()) { // Checks if the textISBN field is empty, if empty, can enter information
                int isbn = Integer.parseInt(textISBN.getText().trim()); // Gets the user input for the book ISBN
                Book book = getBook(isbn); // Creates Book object to use getBook method to get the ISBN
                if(book.getISBN() != -1) { // Checks if the book isbn already exist
                    int option = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to Delete?", "Delete confirmation", JOptionPane.YES_NO_OPTION); // Option pane to confirm deletion
                    if(option == 0) { // If option is yes 
                        deleteBook(isbn); // Deletes book from database
                        refreshBooksTable(); // Updates the book table with new book table information
                        clearBookTextFields(); // Resets and clears the text entry fields
                        message.setText("A book was deleted successfully!"); // Message updater
                    }
                }
                else
                {   // If book does not exist already, cannot be deleted and gives alert message
                    alert("Book does not exist", "Delete error"); // Delete error message
                }
            }
            else
            {   // If textISBN field is still empty, alert message is given 
                alert("ISBN cannot be empty", "Delete error"); // Delete error message
            }
        }
    }//GEN-LAST:event_deleteBookActionPerformed

    private void insertBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBookActionPerformed
        if (textAuthorID.getText().isEmpty()) { // If authorID field is left empty...
            alert("AuthorID cannot be empty", "Insert error"); // alert message is given
        }
        else{
            if (!textISBN.getText().isEmpty()) { // Checks if the textISBN field is empty, if empty, can enter information
            int isbn = Integer.parseInt(textISBN.getText().trim()); // Gets the user input for the book ISBN
            String title = textTitle.getText().trim(); // Gets the user input for the title
            int authorID = Integer.parseInt(textAuthorID.getText().trim()); // Gets the user input for the author ID
            Book book = getBook(isbn); // Creates Book object to use getBook method to get the ISBN
            Author author = getAuthor(authorID); // Creates Author object to use getAuthor method to get the author ID
            if(book.getISBN() != -1) {  // Checks if the book isbn already exist
                alert("Book already exist under that ISBN", "Priamry Key Violation"); // If yes, gives alert message of a primary key violation
            }
            else if (author.getAuthorID() == -1) { // Checks if the author id already exist
                alert("Author does not exist for this book", "Foreign Key Violation"); // If no, gives alert message of a foreign key violation
            }
            else { // If it does not already exist...
                addBook(isbn, title, authorID); // Adds book to into the database
                refreshBooksTable(); // Updates the book table with new book table information
                clearBookTextFields(); // Resets and clears the text entry fields
                message.setText("A new book was inserted successfully!"); // Message updater
            }
        }
            else
            {   // If textISBN field is still empty, alert message is given 
                alert("ISBN cannot be empty", "Insert error"); // Insert error message
            }
        }
    }//GEN-LAST:event_insertBookActionPerformed

    private void authorButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_authorButtonItemStateChanged
        authorIDLabel.setVisible(true);     // All author components are set to become visible
        firstNameLabel.setVisible(true);
        lastNameLabel.setVisible(true);
        textID.setVisible(true);
        textFirstName.setVisible(true);
        textLastName.setVisible(true);
        insertAuthor.setVisible(true);
        updateAuthor.setVisible(true);
        deleteAuthor.setVisible(true);
        updateBook.setVisible(false);       // All book components are set to become not visible
        deleteBook.setVisible(false);
        bookISBNLabel.setVisible(false);
        titleLabel.setVisible(false);
        authorIDBLabel.setVisible(false);
        textISBN.setVisible(false);
        textTitle.setVisible(false);
        textAuthorID.setVisible(false);
        insertBook.setVisible(false);
        header.setText("Author Database Being Accessed..."); // Set header text
    }//GEN-LAST:event_authorButtonItemStateChanged

    private void bookButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_bookButtonItemStateChanged
        updateBook.setVisible(true);        // All book components are set to become visible 
        deleteBook.setVisible(true);
        bookISBNLabel.setVisible(true);
        titleLabel.setVisible(true);
        authorIDBLabel.setVisible(true);
        textISBN.setVisible(true);
        textTitle.setVisible(true);
        textAuthorID.setVisible(true);
        insertBook.setVisible(true);
        authorIDLabel.setVisible(false);    // All author components are set to become not visible
        firstNameLabel.setVisible(false);
        lastNameLabel.setVisible(false);
        textID.setVisible(false);
        textFirstName.setVisible(false);
        textLastName.setVisible(false);
        insertAuthor.setVisible(false);
        updateAuthor.setVisible(false);
        deleteAuthor.setVisible(false);
        header.setText("Book Database Being Accessed..."); // Set header text

    }//GEN-LAST:event_bookButtonItemStateChanged

        static void addAuthor(int authorID, String firstName, String lastName) { // Method adds author into author table
        Author author; // Creates author object
        author = new Author(authorID, firstName, lastName); // Creates author instance
        authorDAO.insert(author); // Runs insert method from AuthorDAO
    }
       

    
    //method to clear the text fields
    private void clearAuthorTextFields() {
        textID.setText("");
        textFirstName.setText("");
        textLastName.setText("");
    }

    //fetch 
    private void refreshAuthorsTable() {
        List<Author> authors = authorDAO.getAll();
        DefaultTableModel model = (DefaultTableModel) authorTable.getModel();
        //Clear all items in authorTable
        for(int i = model.getRowCount() - 1; i >= 0; i-- ) {
            model.removeRow(i);
        }
        for (Author author : authors) {
                Object[] row = new Object[4];
                row[0] = author.getAuthorID();
                row[1] = author.getFirstName();
                row[2] = author.getLastName();
                model.addRow(row);
        }
    }
    
    static Author getAuthor(int authorID) { // Method gets author from author table
        Optional<Author> author = authorDAO.get(authorID); // Creates author instance 
        return author.orElseGet(() -> new Author(-1, "Non-exist", "Non-exist")); // Returns default values if not in author table
    }
    
    
    static void updateAuthor(int authorID, String firstName, String lastName) { // Method updates author in author table 
        Author author; // Creates author object 
        author = new Author (authorID, firstName, lastName); // Creates author instance 
        authorDAO.update(author); // Runs update method from AuthorDAO
    }
    
    static void deleteAuthor(int authorID) { // Method deletes author from author table 
            Author author; // Creates author object 
            author = getAuthor(authorID); // Runs getAuthor method 
            authorDAO.delete(author); // Runs delete method from AuthorDAO
    }
    
    static void printAuthors() { // Method prints author table 
        List<String> headers = authorDAO.getColumnNames();
        int numberCols = headers.size();
        //Print column names as header
        for (int i = 0; i < numberCols; i++) {
            String header = headers.get(i);
            System.out.printf("%25s", header);
        }
        System.out.println();
        //Print the results
        List<Author> authors = authorDAO.getAll();
        int numberRows = authors.size();
        for (int i = 0; i < numberRows; i++) {
            System.out.printf("%25s%25s%25s", authors.get(i).getAuthorID(), authors.get(i).getFirstName(), authors.get(i).getLastName());
            System.out.println();
        }
    }
        
    //method to clear the text fields
    private void clearBookTextFields() {
        textISBN.setText("");
        textTitle.setText("");
        textAuthorID.setText("");
    }
    
    //fetch 
    private void refreshBooksTable() {
        List<Book> books = bookDAO.getAll();
        DefaultTableModel model = (DefaultTableModel) bookTable.getModel();
        //Clear all items in authorTable
        for(int i = model.getRowCount() - 1; i >= 0; i-- ) {
            model.removeRow(i);
        }
        for (Book book : books) {
                Object[] row = new Object[4];
                row[0] = book.getISBN();
                row[1] = book.getTitle();
                row[2] = book.getAuthorID();
                model.addRow(row);
        }
    }
    
    static void addBook(int isbn, String title, int authorID) { // Method adds book into book table
        Book book; // Creates book object
        book = new Book(isbn, title, authorID); // Creates book instance 
        bookDAO.insert(book); // Runs insert method from BookDAO
    }
    
    static Book getBook(int isbn) { // Method gets isbn from book table
        Optional<Book> book = bookDAO.get(isbn); // Creates book instance
        return book.orElseGet(() -> new Book(-1, "Non-exist", -1)); // Returns default values if not in book table
    }
    
    static void updateBook(int isbn, String title, int authorID) { // Method updates book in book table
        Book book; // Creates book object
        book = new Book(isbn, title, authorID); // Creates book instance
        bookDAO.update(book); // Runs update method from BookDAO
    }
    
    static void deleteBook(int isbn) { // Method deletes book from book table 
        Book book; // Creates book object
        book = getBook(isbn); // Runs getBook method 
        bookDAO.delete(book); // Runs delete method from BookDAO
    }
    
    static void printBooks() { // Method prints book table 
        List<String> headers = bookDAO.getColumnNames();
        int numberCols = headers.size();
        //Print column names as header
        for (int i = 0; i < numberCols; i++) {
            String header = headers.get(i);
            System.out.printf("%25s", header);
        }
        System.out.println();
        //Print the results
        List<Book> books = bookDAO.getAll();
        int numberRows = books.size();
        for (int i = 0; i < numberRows; i++) {
            System.out.printf("%25s%25s%25s", books.get(i).getISBN(), books.get(i).getTitle(), books.get(i).getAuthorID());
            System.out.println();
        }
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        authorDAO = new AuthorDAO(); // New author instance created 
        bookDAO = new BookDAO(); // New book instance created 
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton authorButton;
    private javax.swing.JLabel authorIDBLabel;
    private javax.swing.JLabel authorIDLabel;
    private javax.swing.JTable authorTable;
    private javax.swing.JRadioButton bookButton;
    private javax.swing.JLabel bookISBNLabel;
    private javax.swing.JTable bookTable;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton deleteAuthor;
    private javax.swing.JButton deleteBook;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel header;
    private javax.swing.JButton insertAuthor;
    private javax.swing.JButton insertBook;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JLabel message;
    private javax.swing.JLabel status;
    private javax.swing.JLabel tableHeader;
    private javax.swing.JTextField textAuthorID;
    private javax.swing.JTextField textFirstName;
    private javax.swing.JTextField textID;
    private javax.swing.JTextField textISBN;
    private javax.swing.JTextField textLastName;
    private javax.swing.JTextField textTitle;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateAuthor;
    private javax.swing.JButton updateBook;
    // End of variables declaration//GEN-END:variables
}