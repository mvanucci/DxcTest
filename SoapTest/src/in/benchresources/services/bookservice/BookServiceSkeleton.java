
/**
 * BookServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
    package in.benchresources.services.bookservice;

import in.benchresources.entities.book.BookResponseType;

/**
     *  BookServiceSkeleton java skeleton for the axisService
     */
    public class BookServiceSkeleton{
        /**
         * Auto generated method signature
         * 
                                     * @param bookRequestType 
             * @return bookResponseType 
         */
        
                 public in.benchresources.entities.book.BookResponseType getBookByISDNRequestNumber
                  (
                  in.benchresources.entities.book.BookRequestType bookRequestType
                  )
            {
                	 BookResponseType bookResponseType = new BookResponseType();
                	 bookResponseType.setBookISBN(bookRequestType.getIsbnNumber());
                	 bookResponseType.setBookName("Book Web Service SOAP");
                	 bookResponseType.setAuthor("Murilo Vanucci");
                	 bookResponseType.setCategory("Book Category Here");
                	 return bookResponseType;
                //TODO : fill this with the necessary business logic
                
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param bookNameRequestType 
             * @return bookResponseType0 
         */
        
                 public in.benchresources.entities.book.BookResponseType getBookDetailsByBookName
                  (
                  in.benchresources.entities.book.BookNameRequestType bookNameRequestType
                  )
            {
                //TODO : fill this with the necessary business logic
                	 BookResponseType bookResponseType = new BookResponseType();
                	 bookResponseType.setBookISBN("3ert");
                	 bookResponseType.setBookName("Book Web Service My First Web Service");
                	 bookResponseType.setAuthor("Murilo Vanucci");
                	 bookResponseType.setCategory("Book Category Here");
                	 return bookResponseType;
        }
     
    }
    