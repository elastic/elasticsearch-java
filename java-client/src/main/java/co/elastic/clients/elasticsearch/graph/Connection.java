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
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;

// typedef: graph._types.Connection
@JsonpDeserializable
public final class Connection implements JsonpSerializable {
	private final long docCount;

	private final long source;

	private final long target;

	private final double weight;

	// ---------------------------------------------------------------------------------------------

	public Connection(Builder builder) {

		this.docCount = Objects.requireNonNull(builder.docCount, "doc_count");
		this.source = Objects.requireNonNull(builder.source, "source");
		this.target = Objects.requireNonNull(builder.target, "target");
		this.weight = Objects.requireNonNull(builder.weight, "weight");

	}

	public Connection(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code doc_count}
	 */
	public long docCount() {
		return this.docCount;
	}

	/**
	 * API name: {@code source}
	 */
	public long source() {
		return this.source;
	}

	/**
	 * API name: {@code target}
	 */
	public long target() {
		return this.target;
	}

	/**
	 * API name: {@code weight}
	 */
	public double weight() {
		return this.weight;
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

		generator.writeKey("doc_count");
		generator.write(this.docCount);

		generator.writeKey("source");
		generator.write(this.source);

		generator.writeKey("target");
		generator.write(this.target);

		generator.writeKey("weight");
		generator.write(this.weight);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Connection}.
	 */
	public static class Builder implements ObjectBuilder<Connection> {
		private Long docCount;

		private Long source;

		private Long target;

		private Double weight;

		/**
		 * API name: {@code doc_count}
		 */
		public Builder docCount(long value) {
			this.docCount = value;
			return this;
		}

		/**
		 * API name: {@code source}
		 */
		public Builder source(long value) {
			this.source = value;
			return this;
		}

		/**
		 * API name: {@code target}
		 */
		public Builder target(long value) {
			this.target = value;
			return this;
		}

		/**
		 * API name: {@code weight}
		 */
		public Builder weight(double value) {
			this.weight = value;
			return this;
		}

		/**
		 * Builds a {@link Connection}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Connection build() {

			return new Connection(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Connection}
	 */
	public static final JsonpDeserializer<Connection> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Connection::setupConnectionDeserializer, Builder::build);

	protected static void setupConnectionDeserializer(DelegatingDeserializer<Connection.Builder> op) {

		op.add(Builder::docCount, JsonpDeserializer.longDeserializer(), "doc_count");
		op.add(Builder::source, JsonpDeserializer.longDeserializer(), "source");
		op.add(Builder::target, JsonpDeserializer.longDeserializer(), "target");
		op.add(Builder::weight, JsonpDeserializer.doubleDeserializer(), "weight");

	}

}
