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
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: graph._types.VertexInclude
@JsonpDeserializable
public final class VertexInclude implements JsonpSerializable {
	private final Double boost;

	private final String term;

	// ---------------------------------------------------------------------------------------------

	public VertexInclude(Builder builder) {

		this.boost = Objects.requireNonNull(builder.boost, "boost");
		this.term = Objects.requireNonNull(builder.term, "term");

	}

	/**
	 * API name: {@code boost}
	 */
	public Double boost() {
		return this.boost;
	}

	/**
	 * API name: {@code term}
	 */
	public String term() {
		return this.term;
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

		generator.writeKey("boost");
		generator.write(this.boost);

		generator.writeKey("term");
		generator.write(this.term);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link VertexInclude}.
	 */
	public static class Builder implements ObjectBuilder<VertexInclude> {
		private Double boost;

		private String term;

		/**
		 * API name: {@code boost}
		 */
		public Builder boost(Double value) {
			this.boost = value;
			return this;
		}

		/**
		 * API name: {@code term}
		 */
		public Builder term(String value) {
			this.term = value;
			return this;
		}

		/**
		 * Builds a {@link VertexInclude}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public VertexInclude build() {

			return new VertexInclude(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link VertexInclude}
	 */
	public static final JsonpDeserializer<VertexInclude> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			VertexInclude::setupVertexIncludeDeserializer, Builder::build);

	protected static void setupVertexIncludeDeserializer(DelegatingDeserializer<VertexInclude.Builder> op) {

		op.add(Builder::boost, JsonpDeserializer.doubleDeserializer(), "boost");
		op.add(Builder::term, JsonpDeserializer.stringDeserializer(), "term");

	}

}
