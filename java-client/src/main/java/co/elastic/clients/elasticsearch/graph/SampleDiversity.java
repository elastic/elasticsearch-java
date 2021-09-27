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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: graph._types.SampleDiversity
@JsonpDeserializable
public final class SampleDiversity implements JsonpSerializable {
	private final String field;

	private final Integer maxDocsPerValue;

	// ---------------------------------------------------------------------------------------------

	public SampleDiversity(Builder builder) {

		this.field = Objects.requireNonNull(builder.field, "field");
		this.maxDocsPerValue = Objects.requireNonNull(builder.maxDocsPerValue, "max_docs_per_value");

	}

	/**
	 * API name: {@code field}
	 */
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code max_docs_per_value}
	 */
	public Integer maxDocsPerValue() {
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SampleDiversity}.
	 */
	public static class Builder implements ObjectBuilder<SampleDiversity> {
		private String field;

		private Integer maxDocsPerValue;

		/**
		 * API name: {@code field}
		 */
		public Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code max_docs_per_value}
		 */
		public Builder maxDocsPerValue(Integer value) {
			this.maxDocsPerValue = value;
			return this;
		}

		/**
		 * Builds a {@link SampleDiversity}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SampleDiversity build() {

			return new SampleDiversity(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SampleDiversity}
	 */
	public static final JsonpDeserializer<SampleDiversity> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SampleDiversity::setupSampleDiversityDeserializer, Builder::build);

	protected static void setupSampleDiversityDeserializer(DelegatingDeserializer<SampleDiversity.Builder> op) {

		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::maxDocsPerValue, JsonpDeserializer.integerDeserializer(), "max_docs_per_value");

	}

}
