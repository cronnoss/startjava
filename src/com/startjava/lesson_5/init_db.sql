\c jaeger

CREATE TABLE robots (
    id                  SERIAL PRIMARY KEY,
    modelName           TEXT,           
    mark                char(6),           
    height              float4,         
    weight              float4,
    status              text,
    origin              text,
    launch              date,
    kaijuKill           int
);

INSERT INTO robots (modelName, mark, height, weight, status, origin, launch, kaijuKill)
    VALUES  ('Gipsy Danger',    'Mark-3',   260,    1.98,   'Destroyed',    'USA',      '2017-07-10',   9), 
            ('Cherno Alpha',    'Mark-1',   280,    2.412,  'Destroyed',    'Russia',   '2015-01-01',   6),
            ('Diablo Intercept','Mark-2',   300,    1.99,   'Destroyed',    'Chile',    '2016-01-01',   1),
            ('Striker Eureka',  'Mark-5',   250,    1.85,   'Workable',     'Australia','2019-11-02',   11),
            ('Crimson Typhoon', 'Mark-4',   250,    1.722,  'Destroyed',    'China',    '2018-08-22',   7),
            ('Tacit Ronin',     'Mark-1',   244,    7.45,   'Destroyed',    'Japan',    '2015-12-06',   3),
            ('Romeo Blue',      'Mark-1',   255,    7.775,  'Destroyed',    'USA',      '2015-12-15',   2),
            ('Horizon Brave',   'Mark-1',   238,    7.89,   'Destroyed',    'China',    '2015-12-22',   2),
            ('Echo Saber',      'Mark-4',   239,    4.44,   'Workable',     'Japan',    '2018-01-01',   0),
            ('November Ajax',   'Mark-6',   259,    6.66,   'Workable',     'USA',      '2019-01-01',   6);