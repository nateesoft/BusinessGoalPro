package sun.natee.app.main.util;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class UXUtil {

    public static void alignTable(JTable table, int colsAt, int swingConstants) {
        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
        render.setHorizontalAlignment(swingConstants);
        table.getColumnModel().getColumn(colsAt).setCellRenderer(render);
    }
}
