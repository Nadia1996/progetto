BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "Auto" (
	"id"	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	"image"	TEXT,
	"licensePlate"	TEXT NOT NULL,
	"model"	INTEGER NOT NULL
);
COMMIT;
