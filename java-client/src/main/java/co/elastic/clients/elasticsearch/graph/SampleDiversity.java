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

package co.elastic.clients.elasticsearch.graph;

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
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: graph._types.SampleDiversity

/**
 *
 * @see <a href="../doc-files/api-spec.html#graph._types.SampleDiversity">API
 *      specification</a>
 */
@JsonpDeserializable
public class SampleDiversity implements JsonpSerializable {
	private final String field;

	private final int maxDocsPerValue;

	// ---------------------------------------------------------------------------------------------

	private SampleDiversity(Builder builder) {

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.maxDocsPerValue = ApiTypeHelper.requireNonNull(builder.maxDocsPerValue, this, "maxDocsPerValue");

	}

	public static SampleDiversity of(Function<Builder, ObjectBuilder<SampleDiversity>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required - API name: {@code max_docs_per_value}
	 */
	public final int maxDocsPerValue() {
		return this.maxDocsPerValue;
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

		generator.writeKey("field");
		generator.write(this.field);

		generator.writeKey("max_docs_per_value");
		generator.write(this.maxDocsPerValue);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SampleDiversity}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SampleDiversity> {
		private String field;

		private Integer maxDocsPerValue;

		/**
		 * Required - API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required - API name: {@code max_docs_per_value}
		 */
		public final Builder maxDocsPerValue(int value) {
			this.maxDocsPerValue = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SampleDiversity}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SampleDiversity build() {
			_checkSingleUse();

			return new SampleDiversity(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SampleDiversity}
	 */
	public static final JsonpDeserializer<SampleDiversity> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SampleDiversity::setupSampleDiversityDeserializer);

	protected static void setupSampleDiversityDeserializer(ObjectDeserializer<SampleDiversity.Builder> op) {

		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::maxDocsPerValue, JsonpDeserializer.integerDeserializer(), "max_docs_per_value");

	}

}
