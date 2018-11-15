package com.universitaria.cesmag.institucinuniversitariacesmag;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;

public class DBManager {
    private SQLiteDatabase sqlDB;
    static final String DBName="AulasAndBuldings";
    static final String TableName="Buldings";
    static final String ColID="ID";

    static final String ColName="name";
    static final String ColBulids="bulid";
    static final String ColBiso="biso";
    static final String ColBulidName="bulidname";



    static final int DBVersion=18;
    static final String CreateTable="CREATE TABLE IF NOT EXISTS " +
            TableName+" (ID INTEGER PRIMARY KEY AUTOINCREMENT, "+
            ColName+ " TEXT, "+
            ColBiso+ " TEXT, "+
            ColBulids+ " TEXT, "+
            ColBulidName+" TEXT);";

//    static final String CreateTable="CREATE TABLE IF NOT EXISTS " +   // table from lucters
//            TableName+" (ID INTEGER PRIMARY KEY AUTOINCREMENT, "+
//            ColLectName+ " TEXT, "+
//            ColLectFromTime+" TEXT,"+
//            ColLectToTime+" TEXT,"+
//            ColSat+" INTEGER,"+
//            ColSun+" INTEGER,"+
//            ColMon+" INTEGER,"+
//            ColTus+" INTEGER,"+
//            ColWen+" INTEGER,"+
//            ColThe+" INTEGER,"+
//            ColFri+" INTEGER,"+
//            ColLectNum+" TEXT ,"+
//            ColSortTime+" TEXT ,"+
//            hour+" INTEGER , "+
//            min+" INTEGER , "+
//            Ehour+" INTEGER , "+
//            Emin+" INTEGER );";
//

    static class DatabaseHelperUser extends SQLiteOpenHelper{   //database helper to execute create and upgrade the tabels
        Context context;
        DatabaseHelperUser(Context context){
            super(context,DBName,null,DBVersion);
            this.context=context;
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(CreateTable);

            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'image' ,'image' , 'a' ,'SEDE ADMINISTRATIVA' ); ");//20
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Rectoria' ,'no' , 'a' ,'SEDE ADMINISTRATIVA'); ");//20
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Sala de Juntas' ,'no' , 'a','SEDE ADMINISTRATIVA' ); ");//20
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Vicerrectoria de investigaciones' ,'no' , 'a','SEDE ADMINISTRATIVA' ); ");//20
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Contabilidad' ,'no' , 'a','SEDE ADMINISTRATIVA' ); ");//20
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Vicerrectoria administrativa financiera' ,'no' , 'a','SEDE ADMINISTRATIVA' ); ");//20
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Secretaria general' ,'no' , 'a','SEDE ADMINISTRATIVA' ); ");//20
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Tesoreria' ,'no' , 'a','SEDE ADMINISTRATIVA' ); ");//20
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Caja' ,'no' , 'a','SEDE ADMINISTRATIVA' ); ");//20
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Funciones sustantivas' ,'no' , 'a','SEDE ADMINISTRATIVA' ); ");//20
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'W.C. Hombres' ,'no' , 'a','SEDE ADMINISTRATIVA' ); ");//20
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'W.C. Mujeres' ,'no' , 'a','SEDE ADMINISTRATIVA' ); ");//20
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Cuarto tecnico' ,'no' , 'a','SEDE ADMINISTRATIVA' ); ");//20
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Oficina desocupada' ,'no' , 'a','SEDE ADMINISTRATIVA' ); ");//20
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Calidad' ,'no' , 'a','SEDE ADMINISTRATIVA' ); ");//20
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Planeacion' ,'no' , 'a','SEDE ADMINISTRATIVA' ); ");//20
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Cafeteria' ,'no' , 'a' ,'SEDE ADMINISTRATIVA'); ");//20
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Gestion humana' ,'no' , 'a','SEDE ADMINISTRATIVA' ); ");//20
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Auditoria interna' ,'no' , 'a','SEDE ADMINISTRATIVA' ); ");//20
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Sala de juntas San Damian' ,'no' , 'a','SEDE ADMINISTRATIVA' ); ");//20
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'UPS' ,'no' , 'a','SEDE ADMINISTRATIVA' ); ");//20
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'ie' ,'image' , 'a','SEDE ADMINISTRATIVA' ); ");//20


            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'image' ,'image' , 'b','SEDE B' ); ");//20
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase B311' ,'no' , 'b','SEDE B' ); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase B312' ,'no' , 'b','SEDE B' ); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase B313' ,'no' , 'b','SEDE B' ); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase B314' ,'no' , 'b','SEDE B' ); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase B315' ,'no' , 'b','SEDE B' ); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase B316' ,'no' , 'b','SEDE B' ); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase B317' ,'no' , 'b','SEDE B' ); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase B318' ,'no' , 'b','SEDE B' ); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase B319' ,'no' , 'b','SEDE B' ); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase B320' ,'no' , 'b','SEDE B' ); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase B327' ,'no' , 'b','SEDE B' ); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase B328' ,'no' , 'b','SEDE B' ); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Oficina juridica' ,'no' , 'b','SEDE B' ); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Seguridad y Salud en el Trabajo' ,'no' , 'b','SEDE B' ); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Vicerrectoria Academica' ,'no' , 'b','SEDE B' ); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Sala de docentes tiempo completo' ,'no' , 'b','SEDE B' ); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Sala de docentes hora catedra' ,'no' , 'b','SEDE B' ); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Programa de Ingenieria de sistemas' ,'no' , 'b','SEDE B' ); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Decanatura de ingenierias' ,'no' , 'b' ,'SEDE B'); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'oratorio' ,'no' , 'b' ,'SEDE B'); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'cuarto tecnico' ,'no' , 'b' ,'SEDE B'); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'W.C. Hombres' ,'no' , 'b' ,'SEDE B'); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'W.C. mujeres' ,'no' , 'b' ,'SEDE B'); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Monitoria' ,'no' , 'b' ,'SEDE B'); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Sala de sistemas' ,'no' , 'b' ,'SEDE B'); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aula de computo- 4' ,'no' , 'b' ,'SEDE B'); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Laboratorio de redes' ,'no' , 'b' ,'SEDE B'); ");//15

            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'image' ,'image' , 'c','SEDE C' ); ");//20
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Auditorio Santa Clara' ,'no' , 'c','SEDE C' ); ");//23
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase C201' ,'no' , 'c','SEDE C' ); ");//23
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase C202' ,'no' , 'c','SEDE C' ); ");//23
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase C203' ,'no' , 'c','SEDE C' ); ");//23
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Desarrollo de Software' ,'no' , 'c','SEDE C' ); ");//23
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Compras y Suministros' ,'no' , 'c','SEDE C' ); ");//23
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Mantenimiento' ,'no' , 'c','SEDE C' ); ");//23
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Sala de sistemas' ,'no' , 'c','SEDE C' ); ");//23
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Archivo' ,'no' , 'c' ,'SEDE C'); ");//23
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'W.C. mixto' ,'no' , 'c','SEDE C' ); ");//23
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Teatro' ,'no' , 'c' ,'SEDE C'); ");//23
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salon de musica' ,'no' , 'c' ,'SEDE C'); ");//23
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'UPS 1' ,'no' , 'c' ,'SEDE C'); ");//23
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'UPS 2' ,'no' , 'c' ,'SEDE C'); ");//23
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'SANTIAGO' ,'no' , 'c' ,'SEDE C'); ");//23
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Sala de docentes' ,'no' , 'c','SEDE C' ); ");//23
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Direccion' ,'no' , 'c','SEDE C' ); ");//23
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Biblioteca' ,'no' , 'c' ,'SEDE C'); ");//23
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase S201' ,'no' , 'c','SEDE C' ); ");//23
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase S202' ,'no' , 'c','SEDE C' ); ");//23
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase S203' ,'no' , 'c','SEDE C' ); ");//23
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase S204' ,'no' , 'c','SEDE C' ); ");//23
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase S205' ,'no' , 'c','SEDE C' ); ");//23
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase S206' ,'no' , 'c','SEDE C' ); ");//23
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase S208' ,'no' , 'c','SEDE C' ); ");//23
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'talleres' ,'no' , 'c','SEDE C' ); ");//23
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Ideolab' ,'no' , 'c' ,'SEDE C'); ");//23
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Cafeteria' ,'no' , 'c','SEDE C' ); ");//23
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aula de computo- 8' ,'no' , 'c','SEDE C' ); ");//23
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Terraza' ,'no' , 'c','SEDE C' ); ");//23

            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'image' ,'image' , 'd' ,'ITALIA - HOLANDA'); ");//20
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Archivo' ,'1er piso' , 'd','ITALIA - HOLANDA' ); ");//11
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Unidad de archivo y correspondencia' ,'1er piso' , 'd','ITALIA - HOLANDA' ); ");//11
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Cafeteria administrativos' ,'1er piso' , 'd','ITALIA - HOLANDA' ); ");//11
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Unidad de servicio psicologicos' ,'1er piso' , 'd' ,'ITALIA - HOLANDA'); ");//11
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Cuarto Tecnico' ,'1er piso' , 'd' ,'ITALIA - HOLANDA'); ");//11
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'biblioteca' ,'1er piso' , 'd' ,'ITALIA - HOLANDA'); ");//11
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'W.C. Hombres' ,'1er piso' , 'd' ,'ITALIA - HOLANDA'); ");//11
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'W.C. Mujeres' ,'1er piso' , 'd' ,'ITALIA - HOLANDA'); ");//11
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Cafeteria' ,'1er piso' , 'd' ,'ITALIA - HOLANDA'); ");//11
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Vicerrectoria de Bienestar' ,'1er piso' , 'd' ,'ITALIA - HOLANDA'); ");//11
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Proyectos convenios' ,'1er piso' , 'd' ,'ITALIA - HOLANDA'); ");//11

            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'CRE' ,'2do piso' , 'd' ,'ITALIA - HOLANDA'); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Proyeccion social' ,'2do piso' , 'd' ,'ITALIA - HOLANDA'); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Biblioteca' ,'2do piso' , 'd' ,'ITALIA - HOLANDA'); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Sala de Investigadores' ,'2do piso' , 'd' ,'ITALIA - HOLANDA'); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Decanatura ciencias administrativas y contables' ,'2do piso' , 'd','ITALIA - HOLANDA' ); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Programa de Administracion de empresas' ,'2do piso' , 'd','ITALIA - HOLANDA' ); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Programa de Contaduria publica' ,'2do piso' , 'd' ,'ITALIA - HOLANDA'); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'W.C. Hombres' ,'2do piso' , 'd' ,'ITALIA - HOLANDA'); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'W.C. mujeres' ,'2do piso' , 'd' ,'ITALIA - HOLANDA'); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Sala de docentes T.C.' ,'2do piso' , 'd' ,'ITALIA - HOLANDA'); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Cuarto Tecnico' ,'2do piso' , 'd' ,'ITALIA - HOLANDA'); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Sala de docentes H.C.' ,'2do piso' , 'd' ,'ITALIA - HOLANDA'); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Postgrados' ,'2do piso' , 'd' ,'ITALIA - HOLANDA'); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Coordinacion de recreacion y deporte' ,'2do piso' , 'd' ,'ITALIA - HOLANDA'); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase H201F' ,'2do piso' , 'd' ,'ITALIA - HOLANDA'); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase i208' ,'2do piso' , 'd' ,'ITALIA - HOLANDA'); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase i209' ,'2do piso' , 'd' ,'ITALIA - HOLANDA'); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase i212' ,'2do piso' , 'd' ,'ITALIA - HOLANDA'); ");//15
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase i213' ,'2do piso' , 'd' ,'ITALIA - HOLANDA'); ");//15

            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Departamento de idiomas' ,'3er piso' , 'd' ,'ITALIA - HOLANDA'); ");//11
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Departamento de ciencias basicas' ,'3er piso' , 'd' ,'ITALIA - HOLANDA'); ");//11
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Sistema de Evangelizacion' ,'3er piso' , 'd' ,'ITALIA - HOLANDA'); ");//11
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Escuela Franciscana de espiritualidad' ,'3er piso' , 'd' ,'ITALIA - HOLANDA'); ");//11
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Escuela de Paz y fraternidad' ,'3er piso' , 'd','ITALIA - HOLANDA' ); ");//11
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Capellania' ,'3er piso' , 'd','ITALIA - HOLANDA' ); ");//11
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Escuela de Humanidades' ,'3er piso' , 'd' ,'ITALIA - HOLANDA'); ");//11
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Cuarto Tecnico' ,'3er piso' , 'd' ,'ITALIA - HOLANDA'); ");//11
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Sala de docentes' ,'3er piso' , 'd' ,'ITALIA - HOLANDA'); ");//11
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase H302' ,'3er piso' , 'd','ITALIA - HOLANDA' ); ");//11
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase H305' ,'3er piso' , 'd','ITALIA - HOLANDA' ); ");//11
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase H306' ,'3er piso' , 'd','ITALIA - HOLANDA' ); ");//11
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase i308' ,'3er piso' , 'd','ITALIA - HOLANDA' ); ");//11
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase i309' ,'3er piso' , 'd','ITALIA - HOLANDA' ); ");//11
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase i310' ,'3er piso' , 'd','ITALIA - HOLANDA' ); ");//11
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase i311' ,'3er piso' , 'd','ITALIA - HOLANDA' ); ");//11
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase i312' ,'3er piso' , 'd' ,'ITALIA - HOLANDA'); ");//11
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase i315' ,'3er piso' , 'd','ITALIA - HOLANDA' ); ");//11
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase i316' ,'3er piso' , 'd','ITALIA - HOLANDA' ); ");//11
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase i317' ,'3er piso' , 'd','ITALIA - HOLANDA' ); ");//11
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Semilleros de investigacion' ,'3er piso' , 'd','ITALIA - HOLANDA' ); ");//11

            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Decanatura facultad de arquitectura y bellas artes' ,'4to piso' , 'd','ITALIA - HOLANDA' ); ");//8
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Programa de Arquitectura' ,'4to piso' , 'd','ITALIA - HOLANDA' ); ");//8
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Cuarto Tecnico' ,'4to piso' , 'd' ,'ITALIA - HOLANDA'); ");//8
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Sala de docentes de Arquitectura' ,'4to piso' , 'd','ITALIA - HOLANDA' ); ");//8
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Sala de docentes de Derecho' ,'4to piso' , 'd' ,'ITALIA - HOLANDA'); ");//8
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'W.C. Hombres' ,'4to piso' , 'd','ITALIA - HOLANDA' ); ");//8
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'W.C. Mujeres' ,'4to piso' , 'd','ITALIA - HOLANDA' ); ");//8
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de Clase  H401' ,'4to piso' , 'd','ITALIA - HOLANDA' ); ");//8
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de Clase  H402' ,'4to piso' , 'd','ITALIA - HOLANDA' ); ");//8
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de Clase  H403' ,'4to piso' , 'd','ITALIA - HOLANDA' ); ");//8
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de Clase  i406' ,'4to piso' , 'd','ITALIA - HOLANDA' ); ");//8
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de Clase  i407' ,'4to piso' , 'd','ITALIA - HOLANDA' ); ");//8
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de Clase  i409' ,'4to piso' , 'd','ITALIA - HOLANDA' ); ");//8
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de Clase  i410' ,'4to piso' , 'd','ITALIA - HOLANDA' ); ");//8
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de Clase  i411' ,'4to piso' , 'd','ITALIA - HOLANDA' ); ");//8
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de Clase  i412' ,'4to piso' , 'd' ,'ITALIA - HOLANDA'); ");//8
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de Clase  i413' ,'4to piso' , 'd' ,'ITALIA - HOLANDA'); ");//8
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de Clase  i416' ,'4to piso' , 'd' ,'ITALIA - HOLANDA'); ");//8
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de Clase  i417' ,'4to piso' , 'd' ,'ITALIA - HOLANDA'); ");//8
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de Clase  i418' ,'4to piso' , 'd' ,'ITALIA - HOLANDA'); ");//8

            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Decanatura de Ciencias Sociales y Humanas' ,'5to piso' , 'd','ITALIA - HOLANDA' ); ");//12
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Direccion programa de Derecho' ,'5to piso' , 'd','ITALIA - HOLANDA' ); ");//12
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Direccion programa de Psicologia' ,'5to piso' , 'd' ,'ITALIA - HOLANDA'); ");//12
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'W.C. Hombres' ,'5to piso' , 'd' ,'ITALIA - HOLANDA'); ");//12
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'W.C. Mujeres' ,'5to piso' , 'd' ,'ITALIA - HOLANDA'); ");//12
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Camara de Gesell' ,'5to piso' , 'd' ,'ITALIA - HOLANDA'); ");//12
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de Clase  H501' ,'5to piso' , 'd','ITALIA - HOLANDA' ); ");//12
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de Clase  H502' ,'5to piso' , 'd','ITALIA - HOLANDA' ); ");//12
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de Clase  H503' ,'5to piso' , 'd' ,'ITALIA - HOLANDA'); ");//12
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de Clase  H505' ,'5to piso' , 'd','ITALIA - HOLANDA' ); ");//12
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de Clase  H506' ,'5to piso' , 'd','ITALIA - HOLANDA' ); ");//12
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de Clase  H510B' ,'5to piso' , 'd' ,'ITALIA - HOLANDA'); ");//12
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Laboratorio de Radio y Television' ,'5to piso' , 'd','ITALIA - HOLANDA' ); ");//12
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Laboratorio de fotografia analoga' ,'5to piso' , 'd','ITALIA - HOLANDA' ); ");//12
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Monitoria' ,'5to piso' , 'd','ITALIA - HOLANDA' ); ");//12
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Laboratorio de pruebas' ,'5to piso' , 'd','ITALIA - HOLANDA' ); ");//12
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Cuarto Tecnico' ,'5to piso' , 'd','ITALIA - HOLANDA' ); ");//12

            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Laboratorio de Física  H610' ,'6to piso' , 'd','ITALIA - HOLANDA' ); ");//5
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Laboratorio de Electronica  H602' ,'6to piso' , 'd','ITALIA - HOLANDA' ); ");//5
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Oficina laboratoristas' ,'6to piso' , 'd','ITALIA - HOLANDA' ); ");//5
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Cuarto tecnico' ,'6to piso' , 'd','ITALIA - HOLANDA' ); ");//5
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Terraza' ,'6to piso' , 'd','ITALIA - HOLANDA' ); ");//5

            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'image' ,'image' , 'f','SAN FRANCISCO' ); ");//20
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Carpinteria' ,'Sotano' , 'f','SAN FRANCISCO' ); ");//7
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Planta electrica' ,'Sotano' , 'f','SAN FRANCISCO' ); ");//7
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Sub estacion electrica' ,'Sotano' , 'f','SAN FRANCISCO' ); ");//7
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Motobombas' ,'Sotano' , 'f','SAN FRANCISCO' ); ");//7
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Sistema contra incendios' ,'Sotano' , 'f','SAN FRANCISCO' ); ");//7
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'UTB' ,'Sotano' , 'f','SAN FRANCISCO' ); ");//7
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Bodega compras y suministros' ,'Sotano' , 'f','SAN FRANCISCO' ); ");//7

            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Centro de estimulacion infantil' ,'Mezzanine 1' , 'f','SAN FRANCISCO' ); ");//9
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Cuarto de monitoreo' ,'Mezzanine 1' , 'f','SAN FRANCISCO' ); ");//9
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Cuarto tecnico' ,'Mezzanine 1' , 'f','SAN FRANCISCO' ); ");//9
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Bodega mantenimiento electrico' ,'Mezzanine 1' , 'f','SAN FRANCISCO' ); ");//9
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'W.C. Hombres' ,'Mezzanine 1' , 'f','SAN FRANCISCO' ); ");//9
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'W.C. Mujeres' ,'Mezzanine 1' , 'f','SAN FRANCISCO' ); ");//9
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Sala de audiencias' ,'Mezzanine 1' , 'f','SAN FRANCISCO' ); ");//9
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Sala de investigadores' ,'Mezzanine 1' , 'f','SAN FRANCISCO' ); ");//9
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase  A100' ,'Mezzanine 1' , 'f','SAN FRANCISCO' ); ");//9
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase  A101' ,'Mezzanine 1' , 'f','SAN FRANCISCO' ); ");//9

            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Auditorio San Francisco' ,'1er piso' , 'f','SAN FRANCISCO' ); ");//5
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Credito y cartera' ,'1er piso' , 'f','SAN FRANCISCO' ); ");//5
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Publicidad y mercadeo' ,'1er piso' , 'f','SAN FRANCISCO' ); ");//5
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'W.C. Hombres' ,'1er piso' , 'f','SAN FRANCISCO' ); ");//5
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'W.C. Mujeres' ,'1er piso' , 'f','SAN FRANCISCO' ); ");//5

            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Facultad de Educacion' ,'Mezzanine 2' , 'f','SAN FRANCISCO' ); ");//3
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Sala de docentes educacion' ,'Mezzanine 2' , 'f','SAN FRANCISCO' ); ");//3
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Cuarto tecnico' ,'Mezzanine 2' , 'f','SAN FRANCISCO' ); ");//3

            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Sala Mac' ,'2do piso' , 'f','SAN FRANCISCO' ); ");//10
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Sala especial' ,'2do piso' , 'f','SAN FRANCISCO' ); ");//10
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Programa de acompañamiento' ,'2do piso' , 'f','SAN FRANCISCO' ); ");//10
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Trabajo social' ,'2do piso' , 'f','SAN FRANCISCO' ); ");//10
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'permanencia' ,'2do piso' , 'f','SAN FRANCISCO' ); ");//10
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'inclusion y diversidad' ,'2do piso' , 'f','SAN FRANCISCO' ); ");//10
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Cafeteria' ,'2do piso' , 'f','SAN FRANCISCO' ); ");//10
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Hall de San francisco' ,'2do piso' , 'f','SAN FRANCISCO' ); ");//10
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'W.C. Hombres' ,'2do piso' , 'f','SAN FRANCISCO' ); ");//10
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'W.C. mujeres' ,'2do piso' , 'f','SAN FRANCISCO' ); ");//10
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aula Mac A201 ' ,'2do piso' , 'f' ,'SAN FRANCISCO'); ");//8


            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Jefatura de Sistemas e Internet' ,'3er piso' , 'f','SAN FRANCISCO' ); ");//8
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Monitores' ,'3er piso' , 'f','SAN FRANCISCO' ); ");//8
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salas de sistemas' ,'3er piso' , 'f','SAN FRANCISCO' ); ");//8
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Sala Virtual' ,'3er piso' , 'f' ,'SAN FRANCISCO'); ");//8
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aula de clase A301' ,'3er piso' , 'f' ,'SAN FRANCISCO'); ");//8
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Cuarto tecnico' ,'3er piso' , 'f' ,'SAN FRANCISCO'); ");//8
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'W.C. Hombres' ,'3er piso' , 'f' ,'SAN FRANCISCO'); ");//8
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'W.C. mujeres' ,'3er piso' , 'f' ,'SAN FRANCISCO'); ");//8
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Laboratorio de Sistemas Operativos' ,'3er piso' , 'f' ,'SAN FRANCISCO' ); ");//23
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aula  Virtual A302' ,'3er piso' , 'f' ,'SAN FRANCISCO'); ");//8
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aula de computo-5 A303' ,'3er piso' , 'f' ,'SAN FRANCISCO'); ");//8
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aula de computo-6 A304' ,'3er piso' , 'f' ,'SAN FRANCISCO'); ");//8
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aula de computo-7 A305 ' ,'3er piso' , 'f' ,'SAN FRANCISCO'); ");//8
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Laboratorio S.O   A306 ' ,'3er piso' , 'f' ,'SAN FRANCISCO'); ");//8
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aula de computo-3 A309' ,'3er piso' , 'f' ,'SAN FRANCISCO'); ");//8


            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase  A401' ,'4to piso' , 'f' ,'SAN FRANCISCO'); ");//5
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase  A402' ,'4to piso' , 'f' ,'SAN FRANCISCO'); ");//5
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase  A403' ,'4to piso' , 'f' ,'SAN FRANCISCO'); ");//5
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aula de computo-1 A404' ,'4to piso' , 'f' ,'SAN FRANCISCO'); ");//5
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aula de computo-2 A405' ,'4to piso' , 'f' ,'SAN FRANCISCO'); ");//5
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase  A406' ,'4to piso' , 'f' ,'SAN FRANCISCO'); ");//5
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase  A407' ,'4to piso' , 'f' ,'SAN FRANCISCO'); ");//5
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase  A408' ,'4to piso' , 'f' ,'SAN FRANCISCO'); ");//5
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase  A409' ,'4to piso' , 'f' ,'SAN FRANCISCO'); ");//5
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salones de clase  A410' ,'4to piso' , 'f' ,'SAN FRANCISCO'); ");//5
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salas de sistemas' ,'4to piso' , 'f' ,'SAN FRANCISCO'); ");//5
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Cuarto tecnico' ,'4to piso' , 'f' ,'SAN FRANCISCO'); ");//5
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'W.C. Hombres' ,'4to piso' , 'f' ,'SAN FRANCISCO'); ");//5
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'W.C. mujeres' ,'4to piso' , 'f' ,'SAN FRANCISCO'); ");//5

            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aulas de clase  A501' ,'5to piso' , 'f','SAN FRANCISCO' ); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aulas de clase  A502' ,'5to piso' , 'f','SAN FRANCISCO' ); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aulas de clase  A503' ,'5to piso' , 'f','SAN FRANCISCO' ); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aulas de clase  A504' ,'5to piso' , 'f','SAN FRANCISCO' ); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aulas de clase  A505' ,'5to piso' , 'f','SAN FRANCISCO' ); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aulas de clase  A506' ,'5to piso' , 'f','SAN FRANCISCO' ); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aulas de clase  A507' ,'5to piso' , 'f','SAN FRANCISCO' ); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aulas de clase  A508' ,'5to piso' , 'f','SAN FRANCISCO' ); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aulas de clase  A509' ,'5to piso' , 'f' ,'SAN FRANCISCO'); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aulas de clase  A510' ,'5to piso' , 'f' ,'SAN FRANCISCO'); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aulas de clase  A511' ,'5to piso' , 'f' ,'SAN FRANCISCO'); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aulas de clase  A512' ,'5to piso' , 'f' ,'SAN FRANCISCO'); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aulas de clase  A513' ,'5to piso' , 'f' ,'SAN FRANCISCO'); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aulas de clase  A514' ,'5to piso' , 'f' ,'SAN FRANCISCO'); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aulas de clase  A515' ,'5to piso' , 'f' ,'SAN FRANCISCO'); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aulas de clase  A516' ,'5to piso' , 'f' ,'SAN FRANCISCO'); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Cuarto tecnico' ,'5to piso' , 'f' ,'SAN FRANCISCO'); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'W.C. Hombres' ,'5to piso' , 'f','SAN FRANCISCO' ); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'W.C. mujeres' ,'5to piso' , 'f','SAN FRANCISCO' ); ");//4

            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aulas de clase  A601' ,'6to piso' , 'f' ,'SAN FRANCISCO'); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aulas de clase  A602' ,'6to piso' , 'f' ,'SAN FRANCISCO'); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aulas de clase  A603' ,'6to piso' , 'f' ,'SAN FRANCISCO'); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aulas de clase  A604' ,'6to piso' , 'f' ,'SAN FRANCISCO'); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aulas de clase  A605' ,'6to piso' , 'f' ,'SAN FRANCISCO'); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aulas de clase  A606' ,'6to piso' , 'f' ,'SAN FRANCISCO'); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aulas de clase  A607' ,'6to piso' , 'f' ,'SAN FRANCISCO'); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aulas de clase  A608' ,'6to piso' , 'f' ,'SAN FRANCISCO'); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aulas de clase  A609' ,'6to piso' , 'f' ,'SAN FRANCISCO'); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aulas de clase  A610' ,'6to piso' , 'f' ,'SAN FRANCISCO'); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aulas de clase  A611' ,'6to piso' , 'f' ,'SAN FRANCISCO'); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aulas de clase  A612' ,'6to piso' , 'f' ,'SAN FRANCISCO'); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aulas de clase  A613' ,'6to piso' , 'f' ,'SAN FRANCISCO'); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aulas de clase  A614' ,'6to piso' , 'f' ,'SAN FRANCISCO'); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aulas de clase  A615' ,'6to piso' , 'f' ,'SAN FRANCISCO'); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Aulas de clase  A616' ,'6to piso' , 'f' ,'SAN FRANCISCO'); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Cuarto tecnico' ,'6to piso' , 'f' ,'SAN FRANCISCO'); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'W.C. Hombres' ,'6to piso' , 'f' ,'SAN FRANCISCO'); ");//4
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'W.C. mujeres' ,'6to piso' , 'f' ,'SAN FRANCISCO'); ");//4

            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'image' ,'image' , 'g','CONSULTORIO JURIDICO' ); ");//20
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Centro de conciliacion' ,'no' , 'g','CONSULTORIO JURIDICO' ); ");//17
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Sala de conciliacion 1' ,'no' , 'g','CONSULTORIO JURIDICO' ); ");//17
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Sala de conciliacion 2' ,'no' , 'g','CONSULTORIO JURIDICO' ); ");//17
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Sala de conciliacion 3' ,'no' , 'g' ,'CONSULTORIO JURIDICO'); ");//17
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Asistencia' ,'no' , 'g','CONSULTORIO JURIDICO' ); ");//17
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Secretario Administrativo' ,'no' , 'g','CONSULTORIO JURIDICO' ); ");//17
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Secretaría Academica' ,'no' , 'g' ,'CONSULTORIO JURIDICO'); ");//17
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Dirección' ,'no' , 'g' ,'CONSULTORIO JURIDICO'); ");//17
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Derecho penal 1' ,'no' , 'g','CONSULTORIO JURIDICO' ); ");//17
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Derecho penal 2' ,'no' , 'g','CONSULTORIO JURIDICO' ); ");//17
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Práctica empresarial' ,'no' , 'g' ,'CONSULTORIO JURIDICO'); ");//17
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Derecho civil' ,'no' , 'g' ,'CONSULTORIO JURIDICO'); ");//17
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Biblioteca' ,'no' , 'g' ,'CONSULTORIO JURIDICO'); ");//17
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Derecho de familia' ,'no' , 'g' ,'CONSULTORIO JURIDICO'); ");//17
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Brigadas y capacitaciones' ,'no' , 'g' ,'CONSULTORIO JURIDICO'); ");//17
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Derecho laboral' ,'no' , 'g' ,'CONSULTORIO JURIDICO'); ");//17
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Derecho público' ,'no' , 'g','CONSULTORIO JURIDICO' ); ");//17

            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'image' ,'image' , 'h','ESPACIOS GENERALES' ); ");//20
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Gimnasio' ,'no' , 'h','ESPACIOS GENERALES' ); ");//6
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Salon de danzas' ,'no' , 'h','ESPACIOS GENERALES' ); ");//6
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Cancha 1' ,'no' , 'h','ESPACIOS GENERALES' ); ");//6
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Cancha 2' ,'no' , 'h','ESPACIOS GENERALES' ); ");//6
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Cancha 3' ,'no' , 'h','ESPACIOS GENERALES' ); ");//6
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'Coliseo Guillermo de Castellana' ,'no' , 'h','ESPACIOS GENERALES' ); ");//6

            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'ee' ,'image' , 'e', 'e' ); ");//6
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'e' ,'image' , 'e', 'e' ); ");//6

            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'ww' ,'image' , 'w', 'e' ); ");//6
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'w' ,'image' , 'w', 'e' ); ");//6

            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'damian' ,'image' , 'damian', 'damian' ); ");//6
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'damiandamian' ,'image' , 'damian', 'damian' ); ");//6

            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'image' ,'image' , 'x', 'SEDE SANTIAGO PROGRAMA DE DISEÑO GRAFICO' ); ");//6
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'S201' ,'no' , 'x','SEDE SANTIAGO PROGRAMA DE DISEÑO GRAFICO' ); ");//6
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'S202' ,'no' , 'x','SEDE SANTIAGO PROGRAMA DE DISEÑO GRAFICO' ); ");//6
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'S203' ,'no' , 'x','SEDE SANTIAGO PROGRAMA DE DISEÑO GRAFICO' ); ");//6
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'S204' ,'no' , 'x','SEDE SANTIAGO PROGRAMA DE DISEÑO GRAFICO' ); ");//6
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'S205' ,'no' , 'x','SEDE SANTIAGO PROGRAMA DE DISEÑO GRAFICO' ); ");//6
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'S206' ,'no' , 'x','SEDE SANTIAGO PROGRAMA DE DISEÑO GRAFICO' ); ");//6
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'S207 Lab' ,'no' , 'x','SEDE SANTIAGO PROGRAMA DE DISEÑO GRAFICO' ); ");//6
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'S208' ,'no' , 'x','SEDE SANTIAGO PROGRAMA DE DISEÑO GRAFICO' ); ");//6


        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("Drop table IF EXISTS "+TableName);
            onCreate(db);

        }
    }

    public DBManager(Context context){
        DatabaseHelperUser db=new DatabaseHelperUser(context);
        sqlDB = db.getWritableDatabase();
    }



    public long Insert(ContentValues values){
        long ID = sqlDB.insert(TableName,"",values);
        return ID;
    }


    public Cursor query(String[] Projection,String Selection, String[] SelectionArgs,String SortOrder){  //cursor to display elements
        SQLiteQueryBuilder qb=new SQLiteQueryBuilder();
        qb.setTables(TableName);
        Cursor cursor=qb.query(sqlDB, Projection, Selection, SelectionArgs, null, null, SortOrder+" ASC");
        return cursor;
    }


    public int Delete(String Selection,String[] SelectionArgs){        // delete lucturs
        int count = sqlDB.delete(TableName, Selection, SelectionArgs);
        return count;
    }

    public  int Update(ContentValues values,String Selection,String[] SelectionArgs){
        int count=sqlDB.update(TableName,values,Selection,SelectionArgs);
        return count;

    }

}
