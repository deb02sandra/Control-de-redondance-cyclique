public class BD {
}
COPY FROM GBM4967A/miage@cnx_etupre -
TO GBM4967A/miage@cnx_etusec -
REPLACE Sport_2 -
USING
        SELECT cds, urls
FROM Sport;

//Fragment de la table Discipline_2
COPY FROM GBM4967A/miage@cnx_etupre -
TO GBM4967A/miage@cnx_etusec -
REPLACE Discipline_2 -
USING
        SELECT ndd, nomd, typed, cds
FROM Discipline
WHERE genred = 'W';


//Fragment de la table Athlète_2
COPY FROM GBM4967A/miage@cnx_etupre -
TO GBM4967A/miage@cnx_etusec -
REPLACE Athlete_2 -
USING
        SELECT nda, ncomplet, taille, poids, daten, villen, paysn, cio
FROM Athlete
WHERE genre = 'F';


//Fragment de la table pratiquer_2
COPY FROM GBM4967A/miage@cnx_etupre -
TO GBM4967A/miage@cnx_etusec -
REPLACE Pratiquer_2 -
USING
SELECT Pratiquer.*
FROM Pratiquer
JOIN  Athlete
ON  Pratiquer.nda =  Athlete.nda
WHERE   Athlete.genre = 'F';


//Fragment de la table Gagner_I_2
COPY FROM GBM4967A/miage@cnx_etupre -
TO GBM4967A/miage@cnx_etusec -
REPLACE Gagner_I_2 -
USING
SELECT Gagner_I.*
FROM Gagner_I
JOIN  Athlete
ON  Gagner_I.nda =  Athlete.nda
WHERE   Athlete.genre = 'F';
