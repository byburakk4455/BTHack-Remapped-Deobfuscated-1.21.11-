#version auto

#inputs {
    vec4 pos;
    vec4 color;
    vec4 _outlineColor;
    float _outlineSize;
    vec2 rectPosition;
    vec2 _halfSize;
    float _radius;
};

#include<matrices>

#outputs {
    vec4 vertexColor;
    vec4 outlineColor;
    float outlineSize;
    vec2 offset;
    vec2 halfSize;
    float radius;
};

void main() {
    gl_Position = projMat * modelViewMat * pos;
    vertexColor = color;
    outlineColor = _outlineColor;
    outlineSize = _outlineSize;
    offset = pos.xy - rectPosition;
    halfSize = _halfSize;
    radius = _radius;
}