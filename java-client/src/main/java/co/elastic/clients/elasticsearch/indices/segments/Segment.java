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

package co.elastic.clients.elasticsearch.indices.segments;

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
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: indices.segments.Segment

/**
 *
 * @see <a href="../../doc-files/api-spec.html#indices.segments.Segment">API
 *      specification</a>
 */
@JsonpDeserializable
public class Segment implements JsonpSerializable {
	private final Map<String, String> attributes;

	private final boolean committed;

	private final boolean compound;

	private final long deletedDocs;

	private final int generation;

	private final boolean search;

	private final double sizeInBytes;

	private final long numDocs;

	private final String version;

	// ---------------------------------------------------------------------------------------------

	private Segment(Builder builder) {

		this.attributes = ApiTypeHelper.unmodifiableRequired(builder.attributes, this, "attributes");
		this.committed = ApiTypeHelper.requireNonNull(builder.committed, this, "committed");
		this.compound = ApiTypeHelper.requireNonNull(builder.compound, this, "compound");
		this.deletedDocs = ApiTypeHelper.requireNonNull(builder.deletedDocs, this, "deletedDocs");
		this.generation = ApiTypeHelper.requireNonNull(builder.generation, this, "generation");
		this.search = ApiTypeHelper.requireNonNull(builder.search, this, "search");
		this.sizeInBytes = ApiTypeHelper.requireNonNull(builder.sizeInBytes, this, "sizeInBytes");
		this.numDocs = ApiTypeHelper.requireNonNull(builder.numDocs, this, "numDocs");
		this.version = ApiTypeHelper.requireNonNull(builder.version, this, "version");

	}

	public static Segment of(Function<Builder, ObjectBuilder<Segment>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code attributes}
	 */
	public final Map<String, String> attributes() {
		return this.attributes;
	}

	/**
	 * Required - API name: {@code committed}
	 */
	public final boolean committed() {
		return this.committed;
	}

	/**
	 * Required - API name: {@code compound}
	 */
	public final boolean compound() {
		return this.compound;
	}

	/**
	 * Required - API name: {@code deleted_docs}
	 */
	public final long deletedDocs() {
		return this.deletedDocs;
	}

	/**
	 * Required - API name: {@code generation}
	 */
	public final int generation() {
		return this.generation;
	}

	/**
	 * Required - API name: {@code search}
	 */
	public final boolean search() {
		return this.search;
	}

	/**
	 * Required - API name: {@code size_in_bytes}
	 */
	public final double sizeInBytes() {
		return this.sizeInBytes;
	}

	/**
	 * Required - API name: {@code num_docs}
	 */
	public final long numDocs() {
		return this.numDocs;
	}

	/**
	 * Required - API name: {@code version}
	 */
	public final String version() {
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

		if (ApiTypeHelper.isDefined(this.attributes)) {
			generator.writeKey("attributes");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.attributes.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		generator.writeKey("committed");
		generator.write(this.committed);

		generator.writeKey("compound");
		generator.write(this.compound);

		generator.writeKey("deleted_docs");
		generator.write(this.deletedDocs);

		generator.writeKey("generation");
		generator.write(this.generation);

		generator.writeKey("search");
		generator.write(this.search);

		generator.writeKey("size_in_bytes");
		generator.write(this.sizeInBytes);

		generator.writeKey("num_docs");
		generator.write(this.numDocs);

		generator.writeKey("version");
		generator.write(this.version);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Segment}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Segment> {
		private Map<String, String> attributes;

		private Boolean committed;

		private Boolean compound;

		private Long deletedDocs;

		private Integer generation;

		private Boolean search;

		private Double sizeInBytes;

		private Long numDocs;

		private String version;

		/**
		 * Required - API name: {@code attributes}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>attributes</code>.
		 */
		public final Builder attributes(Map<String, String> map) {
			this.attributes = _mapPutAll(this.attributes, map);
			return this;
		}

		/**
		 * Required - API name: {@code attributes}
		 * <p>
		 * Adds an entry to <code>attributes</code>.
		 */
		public final Builder attributes(String key, String value) {
			this.attributes = _mapPut(this.attributes, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code committed}
		 */
		public final Builder committed(boolean value) {
			this.committed = value;
			return this;
		}

		/**
		 * Required - API name: {@code compound}
		 */
		public final Builder compound(boolean value) {
			this.compound = value;
			return this;
		}

		/**
		 * Required - API name: {@code deleted_docs}
		 */
		public final Builder deletedDocs(long value) {
			this.deletedDocs = value;
			return this;
		}

		/**
		 * Required - API name: {@code generation}
		 */
		public final Builder generation(int value) {
			this.generation = value;
			return this;
		}

		/**
		 * Required - API name: {@code search}
		 */
		public final Builder search(boolean value) {
			this.search = value;
			return this;
		}

		/**
		 * Required - API name: {@code size_in_bytes}
		 */
		public final Builder sizeInBytes(double value) {
			this.sizeInBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code num_docs}
		 */
		public final Builder numDocs(long value) {
			this.numDocs = value;
			return this;
		}

		/**
		 * Required - API name: {@code version}
		 */
		public final Builder version(String value) {
			this.version = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Segment}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Segment build() {
			_checkSingleUse();

			return new Segment(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Segment}
	 */
	public static final JsonpDeserializer<Segment> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Segment::setupSegmentDeserializer);

	protected static void setupSegmentDeserializer(ObjectDeserializer<Segment.Builder> op) {

		op.add(Builder::attributes, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"attributes");
		op.add(Builder::committed, JsonpDeserializer.booleanDeserializer(), "committed");
		op.add(Builder::compound, JsonpDeserializer.booleanDeserializer(), "compound");
		op.add(Builder::deletedDocs, JsonpDeserializer.longDeserializer(), "deleted_docs");
		op.add(Builder::generation, JsonpDeserializer.integerDeserializer(), "generation");
		op.add(Builder::search, JsonpDeserializer.booleanDeserializer(), "search");
		op.add(Builder::sizeInBytes, JsonpDeserializer.doubleDeserializer(), "size_in_bytes");
		op.add(Builder::numDocs, JsonpDeserializer.longDeserializer(), "num_docs");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");

	}

}
