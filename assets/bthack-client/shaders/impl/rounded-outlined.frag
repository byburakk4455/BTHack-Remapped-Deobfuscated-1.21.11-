#include<rounded-base>

#inputs {
    vec4 vertexColor;
    vec4 outlineColor;
    float outlineSize;
    vec2 offset;
    vec2 halfSize;
    float radius;
};

void main() {
    vec2 halfSize2 = halfSize - outlineSize;

    float distanceOut = roundedBoxSDF(offset, halfSize, radius);
    float distance = roundedBoxSDF(offset, halfSize2, radius * (length(halfSize2) / length(halfSize)));

    float step = min(1., smoothstep(0., edgeSoftness, distance));
    vec4 outCol = vec4(mix(vertexColor.r, outlineColor.r, step), mix(vertexColor.g, outlineColor.g, step), mix(vertexColor.b, outlineColor.b, step), mix(vertexColor.a, outlineColor.a, step));

    fragColor = vec4(outCol.rgb, (1. - smoothstep(0., edgeSoftness, distanceOut)) * outCol.a);

    fragColor *= shaderColor;
}