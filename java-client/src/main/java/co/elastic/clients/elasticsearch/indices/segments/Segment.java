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

package co.elastic.clients.elasticsearch.indices.segments;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: indices.segments.Segment
public final class Segment implements JsonpSerializable {
	private final Map<String, String> attributes;

	private final Boolean committed;

	private final Boolean compound;

	private final Number deletedDocs;

	private final Number generation;

	private final Number memoryInBytes;

	private final Boolean search;

	private final Number sizeInBytes;

	private final Number numDocs;

	private final String version;

	// ---------------------------------------------------------------------------------------------

	public Segment(Builder builder) {

		this.attributes = Objects.requireNonNull(builder.attributes, "attributes");
		this.committed = Objects.requireNonNull(builder.committed, "committed");
		this.compound = Objects.requireNonNull(builder.compound, "compound");
		this.deletedDocs = Objects.requireNonNull(builder.deletedDocs, "deleted_docs");
		this.generation = Objects.requireNonNull(builder.generation, "generation");
		this.memoryInBytes = Objects.requireNonNull(builder.memoryInBytes, "memory_in_bytes");
		this.search = Objects.requireNonNull(builder.search, "search");
		this.sizeInBytes = Objects.requireNonNull(builder.sizeInBytes, "size_in_bytes");
		this.numDocs = Objects.requireNonNull(builder.numDocs, "num_docs");
		this.version = Objects.requireNonNull(builder.version, "version");

	}

	/**
	 * API name: {@code attributes}
	 */
	public Map<String, String> attributes() {
		return this.attributes;
	}

	/**
	 * API name: {@code committed}
	 */
	public Boolean committed() {
		return this.committed;
	}

	/**
	 * API name: {@code compound}
	 */
	public Boolean compound() {
		return this.compound;
	}

	/**
	 * API name: {@code deleted_docs}
	 */
	public Number deletedDocs() {
		return this.deletedDocs;
	}

	/**
	 * API name: {@code generation}
	 */
	public Number generation() {
		return this.generation;
	}

	/**
	 * API name: {@code memory_in_bytes}
	 */
	public Number memoryInBytes() {
		return this.memoryInBytes;
	}

	/**
	 * API name: {@code search}
	 */
	public Boolean search() {
		return this.search;
	}

	/**
	 * API name: {@code size_in_bytes}
	 */
	public Number sizeInBytes() {
		return this.sizeInBytes;
	}

	/**
	 * API name: {@code num_docs}
	 */
	public Number numDocs() {
		return this.numDocs;
	}

	/**
	 * API name: {@code version}
	 */
	public String version() {
		return this.version;
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

		generator.writeKey("attributes");
		generator.writeStartObject();
		for (Map.Entry<String, String> item0 : this.attributes.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}
		generator.writeEnd();

		generator.writeKey("committed");
		generator.write(this.committed);

		generator.writeKey("compound");
		generator.write(this.compound);

		generator.writeKey("deleted_docs");
		generator.write(this.deletedDocs.doubleValue());

		generator.writeKey("generation");
		generator.write(this.generation.doubleValue());

		generator.writeKey("memory_in_bytes");
		generator.write(this.memoryInBytes.doubleValue());

		generator.writeKey("search");
		generator.write(this.search);

		generator.writeKey("size_in_bytes");
		generator.write(this.sizeInBytes.doubleValue());

		generator.writeKey("num_docs");
		generator.write(this.numDocs.doubleValue());

		generator.writeKey("version");
		generator.write(this.version);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Segment}.
	 */
	public static class Builder implements ObjectBuilder<Segment> {
		private Map<String, String> attributes;

		private Boolean committed;

		private Boolean compound;

		private Number deletedDocs;

		private Number generation;

		private Number memoryInBytes;

		private Boolean search;

		private Number sizeInBytes;

		private Number numDocs;

		private String version;

		/**
		 * API name: {@code attributes}
		 */
		public Builder attributes(Map<String, String> value) {
			this.attributes = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #attributes(Map)}, creating the map if needed.
		 */
		public Builder putAttributes(String key, String value) {
			if (this.attributes == null) {
				this.attributes = new HashMap<>();
			}
			this.attributes.put(key, value);
			return this;
		}

		/**
		 * API name: {@code committed}
		 */
		public Builder committed(Boolean value) {
			this.committed = value;
			return this;
		}

		/**
		 * API name: {@code compound}
		 */
		public Builder compound(Boolean value) {
			this.compound = value;
			return this;
		}

		/**
		 * API name: {@code deleted_docs}
		 */
		public Builder deletedDocs(Number value) {
			this.deletedDocs = value;
			return this;
		}

		/**
		 * API name: {@code generation}
		 */
		public Builder generation(Number value) {
			this.generation = value;
			return this;
		}

		/**
		 * API name: {@code memory_in_bytes}
		 */
		public Builder memoryInBytes(Number value) {
			this.memoryInBytes = value;
			return this;
		}

		/**
		 * API name: {@code search}
		 */
		public Builder search(Boolean value) {
			this.search = value;
			return this;
		}

		/**
		 * API name: {@code size_in_bytes}
		 */
		public Builder sizeInBytes(Number value) {
			this.sizeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code num_docs}
		 */
		public Builder numDocs(Number value) {
			this.numDocs = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(String value) {
			this.version = value;
			return this;
		}

		/**
		 * Builds a {@link Segment}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Segment build() {

			return new Segment(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Segment}
	 */
	public static final JsonpDeserializer<Segment> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, Segment::setupSegmentDeserializer);

	protected static void setupSegmentDeserializer(DelegatingDeserializer<Segment.Builder> op) {

		op.add(Builder::attributes, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"attributes");
		op.add(Builder::committed, JsonpDeserializer.booleanDeserializer(), "committed");
		op.add(Builder::compound, JsonpDeserializer.booleanDeserializer(), "compound");
		op.add(Builder::deletedDocs, JsonpDeserializer.numberDeserializer(), "deleted_docs");
		op.add(Builder::generation, JsonpDeserializer.numberDeserializer(), "generation");
		op.add(Builder::memoryInBytes, JsonpDeserializer.numberDeserializer(), "memory_in_bytes");
		op.add(Builder::search, JsonpDeserializer.booleanDeserializer(), "search");
		op.add(Builder::sizeInBytes, JsonpDeserializer.numberDeserializer(), "size_in_bytes");
		op.add(Builder::numDocs, JsonpDeserializer.numberDeserializer(), "num_docs");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");

	}

}
