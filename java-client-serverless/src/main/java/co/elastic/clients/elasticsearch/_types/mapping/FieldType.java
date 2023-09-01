/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch._types.mapping;

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_types.mapping.FieldType">API
 *      specification</a>
 */
@JsonpDeserializable
public enum FieldType implements JsonEnum {
	None("none"),

	GeoPoint("geo_point"),

	GeoShape("geo_shape"),

	Ip("ip"),

	Binary("binary"),

	Keyword("keyword"),

	Text("text"),

	SearchAsYouType("search_as_you_type"),

	Date("date"),

	DateNanos("date_nanos"),

	Boolean("boolean"),

	Completion("completion"),

	Nested("nested"),

	Object("object"),

	Murmur3("murmur3"),

	TokenCount("token_count"),

	Percolator("percolator"),

	Integer("integer"),

	Long("long"),

	Short("short"),

	Byte("byte"),

	Float("float"),

	HalfFloat("half_float"),

	ScaledFloat("scaled_float"),

	Double("double"),

	IntegerRange("integer_range"),

	FloatRange("float_range"),

	LongRange("long_range"),

	DoubleRange("double_range"),

	DateRange("date_range"),

	IpRange("ip_range"),

	Alias("alias"),

	Join("join"),

	RankFeature("rank_feature"),

	RankFeatures("rank_features"),

	Flattened("flattened"),

	Shape("shape"),

	Histogram("histogram"),

	ConstantKeyword("constant_keyword"),

	AggregateMetricDouble("aggregate_metric_double"),

	DenseVector("dense_vector"),

	MatchOnlyText("match_only_text"),

	;

	private final String jsonValue;

	FieldType(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<FieldType> _DESERIALIZER = new JsonEnum.Deserializer<>(
			FieldType.values());
}
