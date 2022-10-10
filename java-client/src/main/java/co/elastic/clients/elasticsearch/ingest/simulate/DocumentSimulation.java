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

package co.elastic.clients.elasticsearch.ingest.simulate;

import co.elastic.clients.elasticsearch._types.VersionType;
import co.elastic.clients.json.JsonData;
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
import java.lang.Long;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest.simulate.DocumentSimulation

/**
 * The simulated document, with optional metadata.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#ingest.simulate.DocumentSimulation">API
 *      specification</a>
 */
@JsonpDeserializable
public class DocumentSimulation implements JsonpSerializable {
	private final Map<String, String> metadata;

	private final String id;

	private final String index;

	private final Ingest ingest;

	@Nullable
	private final String routing;

	private final Map<String, JsonData> source;

	@Nullable
	private final Long version;

	@Nullable
	private final VersionType versionType;

	// ---------------------------------------------------------------------------------------------

	private DocumentSimulation(Builder builder) {

		this.metadata = ApiTypeHelper.unmodifiable(builder.metadata);

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.ingest = ApiTypeHelper.requireNonNull(builder.ingest, this, "ingest");
		this.routing = builder.routing;
		this.source = ApiTypeHelper.unmodifiableRequired(builder.source, this, "source");
		this.version = builder.version;
		this.versionType = builder.versionType;

	}

	public static DocumentSimulation of(Function<Builder, ObjectBuilder<DocumentSimulation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Additional metadata
	 */
	public final Map<String, String> metadata() {
		return this.metadata;
	}

	/**
	 * Required - API name: {@code _id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code _index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * Required - API name: {@code _ingest}
	 */
	public final Ingest ingest() {
		return this.ingest;
	}

	/**
	 * API name: {@code _routing}
	 */
	@Nullable
	public final String routing() {
		return this.routing;
	}

	/**
	 * Required - API name: {@code _source}
	 */
	public final Map<String, JsonData> source() {
		return this.source;
	}

	/**
	 * API name: {@code _version}
	 */
	@Nullable
	public final Long version() {
		return this.version;
	}

	/**
	 * API name: {@code _version_type}
	 */
	@Nullable
	public final VersionType versionType() {
		return this.versionType;
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

		for (Map.Entry<String, String> item0 : this.metadata.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}

		generator.writeKey("_id");
		generator.write(this.id);

		generator.writeKey("_index");
		generator.write(this.index);

		generator.writeKey("_ingest");
		this.ingest.serialize(generator, mapper);

		if (this.routing != null) {
			generator.writeKey("_routing");
			generator.write(this.routing);

		}
		if (ApiTypeHelper.isDefined(this.source)) {
			generator.writeKey("_source");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.source.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.version != null) {
			generator.writeKey("_version");
			generator.write(this.version);

		}
		if (this.versionType != null) {
			generator.writeKey("_version_type");
			this.versionType.serialize(generator, mapper);
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DocumentSimulation}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DocumentSimulation> {
		@Nullable
		private Map<String, String> metadata = new HashMap<>();

		/**
		 * Additional metadata
		 * <p>
		 * Adds all entries of <code>map</code> to <code>metadata</code>.
		 */
		public final Builder metadata(Map<String, String> map) {
			this.metadata = _mapPutAll(this.metadata, map);
			return this;
		}

		/**
		 * Additional metadata
		 * <p>
		 * Adds an entry to <code>metadata</code>.
		 */
		public final Builder metadata(String key, String value) {
			this.metadata = _mapPut(this.metadata, key, value);
			return this;
		}

		private String id;

		private String index;

		private Ingest ingest;

		@Nullable
		private String routing;

		private Map<String, JsonData> source;

		@Nullable
		private Long version;

		@Nullable
		private VersionType versionType;

		/**
		 * Required - API name: {@code _id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code _index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - API name: {@code _ingest}
		 */
		public final Builder ingest(Ingest value) {
			this.ingest = value;
			return this;
		}

		/**
		 * Required - API name: {@code _ingest}
		 */
		public final Builder ingest(Function<Ingest.Builder, ObjectBuilder<Ingest>> fn) {
			return this.ingest(fn.apply(new Ingest.Builder()).build());
		}

		/**
		 * API name: {@code _routing}
		 */
		public final Builder routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * Required - API name: {@code _source}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>source</code>.
		 */
		public final Builder source(Map<String, JsonData> map) {
			this.source = _mapPutAll(this.source, map);
			return this;
		}

		/**
		 * Required - API name: {@code _source}
		 * <p>
		 * Adds an entry to <code>source</code>.
		 */
		public final Builder source(String key, JsonData value) {
			this.source = _mapPut(this.source, key, value);
			return this;
		}

		/**
		 * API name: {@code _version}
		 */
		public final Builder version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code _version_type}
		 */
		public final Builder versionType(@Nullable VersionType value) {
			this.versionType = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DocumentSimulation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DocumentSimulation build() {
			_checkSingleUse();

			return new DocumentSimulation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DocumentSimulation}
	 */
	public static final JsonpDeserializer<DocumentSimulation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DocumentSimulation::setupDocumentSimulationDeserializer);

	protected static void setupDocumentSimulationDeserializer(ObjectDeserializer<DocumentSimulation.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(Builder::ingest, Ingest._DESERIALIZER, "_ingest");
		op.add(Builder::routing, JsonpDeserializer.stringDeserializer(), "_routing");
		op.add(Builder::source, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "_source");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "_version");
		op.add(Builder::versionType, VersionType._DESERIALIZER, "_version_type");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			builder.metadata(name, JsonpDeserializer.stringDeserializer().deserialize(parser, mapper));
		});

	}

}
