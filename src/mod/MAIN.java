package mod;

import jdk.nashorn.internal.runtime.regexp.joni.SearchAlgorithm;
import static mod.Logic.permissionCompiliter;

public class MAIN extends javax.swing.JFrame {

 public MAIN() {
  initComponents();
 }

 @SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
 private void initComponents() {

  jPanel1 = new javax.swing.JPanel();
  jPanel2 = new javax.swing.JPanel();
  jComboBox2 = new javax.swing.JComboBox();
  jTextField5 = new javax.swing.JTextField();
  jPanel7 = new javax.swing.JPanel();
  jTextField8 = new javax.swing.JTextField();
  jButton1 = new javax.swing.JButton();
  jCheckBox4 = new javax.swing.JCheckBox();
  jPanel3 = new javax.swing.JPanel();
  Suffix = new javax.swing.JTextField();
  Prefix = new javax.swing.JTextField();
  Add_Prefix = new javax.swing.JButton();
  Add_Suffix = new javax.swing.JButton();
  jPanel4 = new javax.swing.JPanel();
  List_Permission = new javax.swing.JComboBox();
  jScrollPane2 = new javax.swing.JScrollPane();
  About_Permission = new javax.swing.JTextArea();
  Permission = new javax.swing.JTextField();
  Flag_Permission = new javax.swing.JCheckBox();
  Add_Permission = new javax.swing.JButton();
  jScrollPane3 = new javax.swing.JScrollPane();
  All_Perms_In_Group = new javax.swing.JTextArea();
  Save_Permissions = new javax.swing.JButton();
  Add_Permission_Not = new javax.swing.JButton();
  jPanel6 = new javax.swing.JPanel();
  Group = new javax.swing.JComboBox();
  Instance_Of = new javax.swing.JComboBox();
  jPanel8 = new javax.swing.JPanel();
  New_Group_Name = new javax.swing.JTextField();
  Add_Group = new javax.swing.JButton();
  Do_Default = new javax.swing.JButton();
  jPanel9 = new javax.swing.JPanel();
  jScrollPane1 = new javax.swing.JScrollPane();
  OUT = new javax.swing.JTextArea();
  jButton6 = new javax.swing.JButton();
  jButton7 = new javax.swing.JButton();
  Add_BaseConfing = new javax.swing.JButton();
  Add_Reload = new javax.swing.JButton();

  setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
  setTitle("Помошник настройки Pex-a");

  jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

  jPanel2.setBackground(new java.awt.Color(204, 204, 204));
  jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

  jComboBox2.setBackground(new java.awt.Color(204, 204, 204));
  jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "world", "world_nether", "world_the_end" }));
  jComboBox2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Выбрать мир", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));
  jComboBox2.setOpaque(false);

  jTextField5.setBackground(new java.awt.Color(204, 204, 204));
  jTextField5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
  jTextField5.setText("world");
  jTextField5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Кастомный мир", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));

  jPanel7.setBackground(new java.awt.Color(153, 153, 153));
  jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

  jTextField8.setBackground(new java.awt.Color(153, 153, 153));
  jTextField8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
  jTextField8.setText("world_test");
  jTextField8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Добавить мир в список миров", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));

  jButton1.setBackground(new java.awt.Color(152, 218, 152));
  jButton1.setText("Добавить");
  jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
  jButton1.setFocusPainted(false);
  jButton1.setFocusable(false);

  javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
  jPanel7.setLayout(jPanel7Layout);
  jPanel7Layout.setHorizontalGroup(
   jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel7Layout.createSequentialGroup()
    .addContainerGap()
    .addComponent(jTextField8)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addContainerGap())
  );
  jPanel7Layout.setVerticalGroup(
   jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel7Layout.createSequentialGroup()
    .addContainerGap()
    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(jButton1)
     .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
  );

  jCheckBox4.setBackground(new java.awt.Color(204, 204, 204));
  jCheckBox4.setText("Использовать только в этом мире");

  javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
  jPanel2.setLayout(jPanel2Layout);
  jPanel2Layout.setHorizontalGroup(
   jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel2Layout.createSequentialGroup()
    .addContainerGap()
    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     .addGroup(jPanel2Layout.createSequentialGroup()
      .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(jCheckBox4)))
    .addContainerGap())
  );
  jPanel2Layout.setVerticalGroup(
   jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel2Layout.createSequentialGroup()
    .addContainerGap()
    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addComponent(jCheckBox4))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
  );

  jPanel3.setBackground(new java.awt.Color(0, 0, 0));
  jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

  Suffix.setBackground(new java.awt.Color(0, 0, 0));
  Suffix.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
  Suffix.setText("Suffix");
  Suffix.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Суффикс группы", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));

  Prefix.setBackground(new java.awt.Color(0, 0, 0));
  Prefix.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
  Prefix.setText("Prefix");
  Prefix.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Префикс группы", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));

  Add_Prefix.setBackground(new java.awt.Color(0, 0, 0));
  Add_Prefix.setText("Установить");
  Add_Prefix.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
  Add_Prefix.setFocusPainted(false);
  Add_Prefix.setFocusable(false);

  Add_Suffix.setBackground(new java.awt.Color(0, 0, 0));
  Add_Suffix.setText("Установить");
  Add_Suffix.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
  Add_Suffix.setFocusPainted(false);
  Add_Suffix.setFocusable(false);

  javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
  jPanel3.setLayout(jPanel3Layout);
  jPanel3Layout.setHorizontalGroup(
   jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel3Layout.createSequentialGroup()
    .addContainerGap()
    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addComponent(Prefix)
     .addComponent(Suffix))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
     .addComponent(Add_Prefix, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
     .addComponent(Add_Suffix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    .addContainerGap())
  );
  jPanel3Layout.setVerticalGroup(
   jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel3Layout.createSequentialGroup()
    .addContainerGap()
    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(Prefix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addComponent(Add_Prefix))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(Suffix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addComponent(Add_Suffix))
    .addContainerGap())
  );

  jPanel4.setBackground(new java.awt.Color(204, 204, 204));
  jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

  List_Permission.setBackground(new java.awt.Color(204, 204, 204));
  List_Permission.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "chatex.allowchat.*" }));
  List_Permission.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Разрешение", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));
  List_Permission.setOpaque(false);

  jScrollPane2.setBackground(new java.awt.Color(204, 204, 204));
  jScrollPane2.setBorder(null);
  jScrollPane2.setViewportBorder(javax.swing.BorderFactory.createTitledBorder(null, "Описание разрешения", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));

  About_Permission.setColumns(20);
  About_Permission.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
  About_Permission.setRows(5);
  jScrollPane2.setViewportView(About_Permission);

  Permission.setBackground(new java.awt.Color(204, 204, 204));
  Permission.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
  Permission.setText("jTextField2");
  Permission.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Кастомное разрешение", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));

  Flag_Permission.setBackground(new java.awt.Color(204, 204, 204));
  Flag_Permission.setText("Запретить?");

  Add_Permission.setBackground(new java.awt.Color(152, 218, 152));
  Add_Permission.setText("Добавить");
  Add_Permission.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
  Add_Permission.setFocusPainted(false);
  Add_Permission.setFocusable(false);

  jScrollPane3.setBackground(new java.awt.Color(204, 204, 204));
  jScrollPane3.setBorder(null);
  jScrollPane3.setViewportBorder(javax.swing.BorderFactory.createTitledBorder(null, "Список разрешений группы", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));

  All_Perms_In_Group.setColumns(20);
  All_Perms_In_Group.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
  All_Perms_In_Group.setRows(5);
  jScrollPane3.setViewportView(All_Perms_In_Group);

  Save_Permissions.setBackground(new java.awt.Color(152, 218, 152));
  Save_Permissions.setText("Сохранить это список (не используйте если не знаете как)");
  Save_Permissions.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
  Save_Permissions.setFocusPainted(false);
  Save_Permissions.setFocusable(false);

  Add_Permission_Not.setBackground(new java.awt.Color(152, 218, 152));
  Add_Permission_Not.setText("Забрать");
  Add_Permission_Not.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
  Add_Permission_Not.setFocusPainted(false);
  Add_Permission_Not.setFocusable(false);

  javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
  jPanel4.setLayout(jPanel4Layout);
  jPanel4Layout.setHorizontalGroup(
   jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel4Layout.createSequentialGroup()
    .addContainerGap()
    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addComponent(jScrollPane2)
     .addComponent(jScrollPane3)
     .addComponent(Save_Permissions, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
      .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       .addComponent(Permission)
       .addComponent(List_Permission, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
        .addComponent(Add_Permission, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
        .addComponent(Add_Permission_Not, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
       .addComponent(Flag_Permission, javax.swing.GroupLayout.Alignment.TRAILING))))
    .addContainerGap())
  );
  jPanel4Layout.setVerticalGroup(
   jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel4Layout.createSequentialGroup()
    .addContainerGap()
    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(jPanel4Layout.createSequentialGroup()
      .addComponent(List_Permission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addGap(11, 11, 11)
      .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
       .addComponent(Permission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
       .addComponent(Add_Permission_Not, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
     .addGroup(jPanel4Layout.createSequentialGroup()
      .addComponent(Flag_Permission)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
      .addComponent(Add_Permission, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(Save_Permissions)
    .addContainerGap())
  );

  jPanel6.setBackground(new java.awt.Color(204, 204, 204));
  jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

  Group.setBackground(new java.awt.Color(204, 204, 204));
  Group.setToolTipText("");
  Group.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Группа", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));
  Group.setOpaque(false);

  Instance_Of.setBackground(new java.awt.Color(204, 204, 204));
  Instance_Of.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BASE" }));
  Instance_Of.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Наследуется от", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));
  Instance_Of.setOpaque(false);

  jPanel8.setBackground(new java.awt.Color(153, 153, 153));
  jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

  New_Group_Name.setBackground(new java.awt.Color(153, 153, 153));
  New_Group_Name.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
  New_Group_Name.setText("Player");
  New_Group_Name.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Добавить группу", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));

  Add_Group.setBackground(new java.awt.Color(152, 218, 152));
  Add_Group.setText("Добавить");
  Add_Group.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
  Add_Group.setFocusPainted(false);
  Add_Group.setFocusable(false);
  Add_Group.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    Add_GroupActionPerformed(evt);
   }
  });

  javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
  jPanel8.setLayout(jPanel8Layout);
  jPanel8Layout.setHorizontalGroup(
   jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel8Layout.createSequentialGroup()
    .addContainerGap()
    .addComponent(New_Group_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(Add_Group, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addContainerGap())
  );
  jPanel8Layout.setVerticalGroup(
   jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel8Layout.createSequentialGroup()
    .addContainerGap()
    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(Add_Group)
     .addComponent(New_Group_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
  );

  Do_Default.setBackground(new java.awt.Color(152, 218, 152));
  Do_Default.setText("Сделать начальной");
  Do_Default.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
  Do_Default.setFocusPainted(false);
  Do_Default.setFocusable(false);
  Do_Default.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    Do_DefaultActionPerformed(evt);
   }
  });

  javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
  jPanel6.setLayout(jPanel6Layout);
  jPanel6Layout.setHorizontalGroup(
   jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel6Layout.createSequentialGroup()
    .addContainerGap()
    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
      .addComponent(Instance_Of, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(Do_Default, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
     .addComponent(Group, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    .addContainerGap())
  );
  jPanel6Layout.setVerticalGroup(
   jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel6Layout.createSequentialGroup()
    .addContainerGap()
    .addComponent(Group, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(Instance_Of, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addComponent(Do_Default))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addContainerGap())
  );

  jPanel9.setBackground(new java.awt.Color(204, 204, 204));
  jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

  jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));
  jScrollPane1.setBorder(null);
  jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createTitledBorder(null, "Конфинг", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));

  OUT.setColumns(20);
  OUT.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
  OUT.setRows(5);
  OUT.setBorder(null);
  jScrollPane1.setViewportView(OUT);

  jButton6.setBackground(new java.awt.Color(152, 218, 152));
  jButton6.setText("Сохранить внутри приложения");
  jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
  jButton6.setFocusPainted(false);
  jButton6.setFocusable(false);

  jButton7.setBackground(new java.awt.Color(152, 218, 152));
  jButton7.setText("Копировать");
  jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
  jButton7.setFocusPainted(false);
  jButton7.setFocusable(false);

  Add_BaseConfing.setBackground(new java.awt.Color(152, 218, 152));
  Add_BaseConfing.setText("Вывести шаблон");
  Add_BaseConfing.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
  Add_BaseConfing.setFocusPainted(false);
  Add_BaseConfing.setFocusable(false);

  Add_Reload.setBackground(new java.awt.Color(152, 218, 152));
  Add_Reload.setText("Перезагрузить");
  Add_Reload.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
  Add_Reload.setFocusPainted(false);
  Add_Reload.setFocusable(false);
  Add_Reload.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    Add_ReloadActionPerformed(evt);
   }
  });

  javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
  jPanel9.setLayout(jPanel9Layout);
  jPanel9Layout.setHorizontalGroup(
   jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel9Layout.createSequentialGroup()
    .addContainerGap()
    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addComponent(jScrollPane1)
     .addGroup(jPanel9Layout.createSequentialGroup()
      .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(Add_BaseConfing, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(Add_Reload, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
    .addContainerGap())
  );
  jPanel9Layout.setVerticalGroup(
   jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
    .addContainerGap()
    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(jButton6)
     .addComponent(jButton7)
     .addComponent(Add_BaseConfing)
     .addComponent(Add_Reload))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
    .addContainerGap())
  );

  javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
  jPanel1.setLayout(jPanel1Layout);
  jPanel1Layout.setHorizontalGroup(
   jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel1Layout.createSequentialGroup()
    .addContainerGap()
    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
     .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    .addContainerGap())
  );
  jPanel1Layout.setVerticalGroup(
   jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel1Layout.createSequentialGroup()
    .addContainerGap()
    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(jPanel1Layout.createSequentialGroup()
      .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addGap(10, 10, 10))
     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
      .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addContainerGap())))
  );

  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
  getContentPane().setLayout(layout);
  layout.setHorizontalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
  );
  layout.setVerticalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
  );

  pack();
  setLocationRelativeTo(null);
 }// </editor-fold>//GEN-END:initComponents

 private void Add_ReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_ReloadActionPerformed
  OUT.setText(permissionCompiliter());
 }//GEN-LAST:event_Add_ReloadActionPerformed

 private void Add_GroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_GroupActionPerformed

   Init.GroupSet(New_Group_Name.getText(), new String[]{}, new String[]{}, new String[]{}, "", false);
 }//GEN-LAST:event_Add_GroupActionPerformed

 private void Do_DefaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Do_DefaultActionPerformed
  // TODO add your handling code here:
 }//GEN-LAST:event_Do_DefaultActionPerformed

 public static void main(String args[]) {
  new MAIN().setVisible(true);
  Init.GroupSet("Base", new String[]{",true,chatex.allowchat", "world,false,nte.admin", ",true,nte.admin"}, new String[]{",prefix"}, new String[]{"world,suffix"}, "", true);
  Init.GroupSet("Admin", new String[]{",true,chatex.allowchat", "world,true,nte.admin", ",true,nte.admin"}, new String[]{",prefix"}, new String[]{"world,suffix"}, "", true);
  Init.GroupSet("Moder", new String[]{",true,chatex.allowchat", "world,false,nte.admin", ",false,nte.admin"}, new String[]{",prefix"}, new String[]{"world,suffix"}, "", false);
 }

 // Variables declaration - do not modify//GEN-BEGIN:variables
 public static javax.swing.JTextArea About_Permission;
 public static javax.swing.JButton Add_BaseConfing;
 public static javax.swing.JButton Add_Group;
 public static javax.swing.JButton Add_Permission;
 public static javax.swing.JButton Add_Permission_Not;
 public static javax.swing.JButton Add_Prefix;
 public static javax.swing.JButton Add_Reload;
 public static javax.swing.JButton Add_Suffix;
 public static javax.swing.JTextArea All_Perms_In_Group;
 public static javax.swing.JButton Do_Default;
 public static javax.swing.JCheckBox Flag_Permission;
 public static javax.swing.JComboBox Group;
 public static javax.swing.JComboBox Instance_Of;
 public static javax.swing.JComboBox List_Permission;
 public static javax.swing.JTextField New_Group_Name;
 public static javax.swing.JTextArea OUT;
 public static javax.swing.JTextField Permission;
 public static javax.swing.JTextField Prefix;
 public static javax.swing.JButton Save_Permissions;
 public static javax.swing.JTextField Suffix;
 public static javax.swing.JButton jButton1;
 public static javax.swing.JButton jButton6;
 public static javax.swing.JButton jButton7;
 public static javax.swing.JCheckBox jCheckBox4;
 public static javax.swing.JComboBox jComboBox2;
 public static javax.swing.JPanel jPanel1;
 public static javax.swing.JPanel jPanel2;
 public static javax.swing.JPanel jPanel3;
 public static javax.swing.JPanel jPanel4;
 public static javax.swing.JPanel jPanel6;
 public static javax.swing.JPanel jPanel7;
 public static javax.swing.JPanel jPanel8;
 public static javax.swing.JPanel jPanel9;
 public static javax.swing.JScrollPane jScrollPane1;
 public static javax.swing.JScrollPane jScrollPane2;
 public static javax.swing.JScrollPane jScrollPane3;
 public static javax.swing.JTextField jTextField5;
 public static javax.swing.JTextField jTextField8;
 // End of variables declaration//GEN-END:variables
}
