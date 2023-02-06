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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.GeoResults

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.GeoResults">API
 *      specification</a>
 */
@JsonpDeserializable
public class GeoResults implements JsonpSerializable {
	private final String actualPoint;

	private final String typicalPoint;

	// ---------------------------------------------------------------------------------------------

	private GeoResults(Builder builder) {

		this.actualPoint = ApiTypeHelper.requireNonNull(builder.actualPoint, this, "actualPoint");
		this.typicalPoint = ApiTypeHelper.requireNonNull(builder.typicalPoint, this, "typicalPoint");

	}

	public static GeoResults of(Function<Builder, ObjectBuilder<GeoResults>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The actual value for the bucket formatted as a
	 * <code>geo_point</code>.
	 * <p>
	 * API name: {@code actual_point}
	 */
	public final String actualPoint() {
		return this.actualPoint;
	}

	/**
	 * Required - The typical value for the bucket formatted as a
	 * <code>geo_point</code>.
	 * <p>
	 * API name: {@code typical_point}
	 */
	public final String typicalPoint() {
		return this.typicalPoint;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("actual_point");
		generator.write(this.actualPoint);

		generator.writeKey("typical_point");
		generator.write(this.typicalPoint);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoResults}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<GeoResults> {
		private String actualPoint;

		private String typicalPoint;

		/**
		 * Required - The actual value for the bucket formatted as a
		 * <code>geo_point</code>.
		 * <p>
		 * API name: {@code actual_point}
		 */
		public final Builder actualPoint(String value) {
			this.actualPoint = value;
			return this;
		}

		/**
		 * Required - The typical value for the bucket formatted as a
		 * <code>geo_point</code>.
		 * <p>
		 * API name: {@code typical_point}
		 */
		public final Builder typicalPoint(String value) {
			this.typicalPoint = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GeoResults}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoResults build() {
			_checkSingleUse();

			return new GeoResults(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoResults}
	 */
	public static final JsonpDeserializer<GeoResults> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GeoResults::setupGeoResultsDeserializer);

	protected static void setupGeoResultsDeserializer(ObjectDeserializer<GeoResults.Builder> op) {

		op.add(Builder::actualPoint, JsonpDeserializer.stringDeserializer(), "actual_point");
		op.add(Builder::typicalPoint, JsonpDeserializer.stringDeserializer(), "typical_point");

	}

}
