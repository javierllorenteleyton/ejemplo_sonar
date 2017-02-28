package com.avanttic.appadf.view;

import javax.print.DocFlavor;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.attribute.standard.PrinterName;

public class Impresoras {
    public static PrintService getPrintService(String printername) {
        
        // Initalize print service
        
        if (printername == null) {
            return PrintServiceLookup.lookupDefaultPrintService();       
        } else {
            
            if ("(Show dialog)".equals(printername)) {
                return null; // null means "you have to show the print dialog"
            } else if ("(Default)".equals(printername)) {
                return PrintServiceLookup.lookupDefaultPrintService(); 
            } else {
                PrintService[] pservices = 
                        PrintServiceLookup.lookupPrintServices(DocFlavor.SERVICE_FORMATTED.PRINTABLE , null);
                for (PrintService s : pservices) {    
                    if (printername.equals(s.getName())) {
                        return s;
                    }
                }
                return PrintServiceLookup.lookupDefaultPrintService();       
            }                
        }                 
    }
    public static PrintService getPrintService(String printername) {
        
        // Initalize print service
        
        if (printername == null) {
            return PrintServiceLookup.lookupDefaultPrintService();       
        } else {
            
            if ("(Show dialog)".equals(printername)) {
                return null; // null means "you have to show the print dialog"
            } else if ("(Default)".equals(printername)) {
                return PrintServiceLookup.lookupDefaultPrintService(); 
            } else {
                PrintService[] pservices = 
                        PrintServiceLookup.lookupPrintServices(DocFlavor.SERVICE_FORMATTED.PRINTABLE , null);
                for (PrintService s : pservices) {    
                    if (printername.equals(s.getName())) {
                        return s;
                    }
                }
                return PrintServiceLookup.lookupDefaultPrintService();       
            }                
        }                 
    }
    /**
     *
     * @param printername
     * @return
     */
    public static PrintService getPrintService(String printername) {
        
        // Initalize print service
        
        if (printername == null) {
            return PrintServiceLookup.lookupDefaultPrintService();       
        } else {
            
            if ("(Show dialog)".equals(printername)) {
                return null; // null means "you have to show the print dialog"
            } else if ("(Default)".equals(printername)) {
                return PrintServiceLookup.lookupDefaultPrintService(); 
            } else {
                PrintService[] pservices = 
                        PrintServiceLookup.lookupPrintServices(DocFlavor.SERVICE_FORMATTED.PRINTABLE , null);
                for (PrintService s : pservices) {    
                    if (printername.equals(s.getName())) {
                        return s;
                    }
                }
                return PrintServiceLookup.lookupDefaultPrintService();       
            }                
        }                 
    }
    /** {@collect.stats} 
     * A convenience method which looks up 2D print services.
     * Services returned from this method may be installed on
     * <code>PrinterJob</code>s which support print services.
     * Calling this method is equivalent to calling
     * {@link javax.print.PrintServiceLookup#lookupPrintServices(
     * DocFlavor, AttributeSet)
     * <code>PrintServiceLookup.lookupPrintServices()</code>}
     * and specifying a Pageable DocFlavor.
     * @return a possibly empty array of 2D print services.
     * @since     1.4
     */
    public static PrintService[] lookupPrintServices() {
        return PrintServiceLookup.
            lookupPrintServices(DocFlavor.SERVICE_FORMATTED.PAGEABLE, null);
    }
    /**
     * A convenience method which looks up 2D print services.
     * Services returned from this method may be installed on
     * <code>PrinterJob</code>s which support print services.
     * Calling this method is equivalent to calling
     * {@link javax.print.PrintServiceLookup#lookupPrintServices(
     * DocFlavor, AttributeSet)
     * <code>PrintServiceLookup.lookupPrintServices()</code>}
     * and specifying a Pageable DocFlavor.
     * @return a possibly empty array of 2D print services.
     * @since     1.4
     */
    public static PrintService[] lookupPrintServices() {
        return PrintServiceLookup.
            lookupPrintServices(DocFlavor.SERVICE_FORMATTED.PAGEABLE, null);
    }
    /**
     * A convenience method which looks up 2D print services.
     * Services returned from this method may be installed on
     * <code>PrinterJob</code>s which support print services.
     * Calling this method is equivalent to calling
     * {@link javax.print.PrintServiceLookup#lookupPrintServices(
     * DocFlavor, AttributeSet)
     * <code>PrintServiceLookup.lookupPrintServices()</code>}
     * and specifying a Pageable DocFlavor.
     * @return a possibly empty array of 2D print services.
     * @since     1.4
     */
    public static PrintService[] lookupPrintServices() {
        return PrintServiceLookup.
            lookupPrintServices(DocFlavor.SERVICE_FORMATTED.PAGEABLE, null);
    }
    public TableModel produce( final DataRow parameters,
                               final DataFactoryContext dataFactoryContext ) throws ReportDataFactoryException {
      final PrintService[] services =
        PrintServiceLookup.lookupPrintServices( DocFlavor.SERVICE_FORMATTED.PAGEABLE, null );
      final TypedTableModel tt = new TypedTableModel();
      tt.addColumn( "Printer ID", String.class );
      tt.addColumn( "Printer Name", String.class );
      for ( int i = 0; i < services.length; i++ ) {
        final PrintService service = services[ i ];
        final PrinterName displayName = service.getAttribute( PrinterName.class );
        if ( displayName != null ) {
          tt.addRow( new Object[] { service.getName(), displayName.getValue() } );
        } else {
          tt.addRow( new Object[] { service.getName(), service.getName() } );
        }
      }
      return tt;
    }
}
