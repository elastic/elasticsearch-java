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

package co.elastic.clients.elasticsearch.ingest.geo_ip_stats;

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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest.geo_ip_stats.GeoIpNodeDatabases

/**
 * Downloaded databases for the node. The field key is the node ID.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#ingest.geo_ip_stats.GeoIpNodeDatabases">API
 *      specification</a>
 */
@JsonpDeserializable
public class GeoIpNodeDatabases implements JsonpSerializable {
	private final List<GeoIpNodeDatabaseName> databases;

	private final List<String> filesInTemp;

	// ---------------------------------------------------------------------------------------------

	private GeoIpNodeDatabases(Builder builder) {

		this.databases = ApiTypeHelper.unmodifiableRequired(builder.databases, this, "databases");
		this.filesInTemp = ApiTypeHelper.unmodifiableRequired(builder.filesInTemp, this, "filesInTemp");

	}

	public static GeoIpNodeDatabases of(Function<Builder, ObjectBuilder<GeoIpNodeDatabases>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Downloaded databases for the node.
	 * <p>
	 * API name: {@code databases}
	 */
	public final List<GeoIpNodeDatabaseName> databases() {
		return this.databases;
	}

	/**
	 * Required - Downloaded database files, including related license files.
	 * Elasticsearch stores these files in the node’s temporary directory:
	 * $ES_TMPDIR/geoip-databases/&lt;node_id&gt;.
	 * <p>
	 * API name: {@code files_in_temp}
	 */
	public final List<String> filesInTemp() {
		return this.filesInTemp;
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

		if (ApiTypeHelper.isDefined(this.databases)) {
			generator.writeKey("databases");
			generator.writeStartArray();
			for (GeoIpNodeDatabaseName item0 : this.databases) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.filesInTemp)) {
			generator.writeKey("files_in_temp");
			generator.writeStartArray();
			for (String item0 : this.filesInTemp) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoIpNodeDatabases}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GeoIpNodeDatabases> {
		private List<GeoIpNodeDatabaseName> databases;

		private List<String> filesInTemp;

		/**
		 * Required - Downloaded databases for the node.
		 * <p>
		 * API name: {@code databases}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>databases</code>.
		 */
		public final Builder databases(List<GeoIpNodeDatabaseName> list) {
			this.databases = _listAddAll(this.databases, list);
			return this;
		}

		/**
		 * Required - Downloaded databases for the node.
		 * <p>
		 * API name: {@code databases}
		 * <p>
		 * Adds one or more values to <code>databases</code>.
		 */
		public final Builder databases(GeoIpNodeDatabaseName value, GeoIpNodeDatabaseName... values) {
			this.databases = _listAdd(this.databases, value, values);
			return this;
		}

		/**
		 * Required - Downloaded databases for the node.
		 * <p>
		 * API name: {@code databases}
		 * <p>
		 * Adds a value to <code>databases</code> using a builder lambda.
		 */
		public final Builder databases(
				Function<GeoIpNodeDatabaseName.Builder, ObjectBuilder<GeoIpNodeDatabaseName>> fn) {
			return databases(fn.apply(new GeoIpNodeDatabaseName.Builder()).build());
		}

		/**
		 * Required - Downloaded database files, including related license files.
		 * Elasticsearch stores these files in the node’s temporary directory:
		 * $ES_TMPDIR/geoip-databases/&lt;node_id&gt;.
		 * <p>
		 * API name: {@code files_in_temp}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>filesInTemp</code>.
		 */
		public final Builder filesInTemp(List<String> list) {
			this.filesInTemp = _listAddAll(this.filesInTemp, list);
			return this;
		}

		/**
		 * Required - Downloaded database files, including related license files.
		 * Elasticsearch stores these files in the node’s temporary directory:
		 * $ES_TMPDIR/geoip-databases/&lt;node_id&gt;.
		 * <p>
		 * API name: {@code files_in_temp}
		 * <p>
		 * Adds one or more values to <code>filesInTemp</code>.
		 */
		public final Builder filesInTemp(String value, String... values) {
			this.filesInTemp = _listAdd(this.filesInTemp, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GeoIpNodeDatabases}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoIpNodeDatabases build() {
			_checkSingleUse();

			return new GeoIpNodeDatabases(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoIpNodeDatabases}
	 */
	public static final JsonpDeserializer<GeoIpNodeDatabases> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GeoIpNodeDatabases::setupGeoIpNodeDatabasesDeserializer);

	protected static void setupGeoIpNodeDatabasesDeserializer(ObjectDeserializer<GeoIpNodeDatabases.Builder> op) {

		op.add(Builder::databases, JsonpDeserializer.arrayDeserializer(GeoIpNodeDatabaseName._DESERIALIZER),
				"databases");
		op.add(Builder::filesInTemp, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"files_in_temp");

	}

}
