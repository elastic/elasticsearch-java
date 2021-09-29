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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.ExpandWildcardOptions;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: indices.put_settings.Request
@JsonpDeserializable
public final class PutSettingsRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final List<String> index;

	@Nullable
	private final Boolean allowNoIndices;

	@Nullable
	private final List<ExpandWildcardOptions> expandWildcards;

	@Nullable
	private final Boolean flatSettings;

	@Nullable
	private final Boolean ignoreUnavailable;

	@Nullable
	private final String masterTimeout;

	@Nullable
	private final Boolean preserveExisting;

	@Nullable
	private final String timeout;

	private final IndexSettings settings;

	// ---------------------------------------------------------------------------------------------

	public PutSettingsRequest(Builder builder) {

		this.index = ModelTypeHelper.unmodifiable(builder.index);
		this.allowNoIndices = builder.allowNoIndices;
		this.expandWildcards = ModelTypeHelper.unmodifiable(builder.expandWildcards);
		this.flatSettings = builder.flatSettings;
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.masterTimeout = builder.masterTimeout;
		this.preserveExisting = builder.preserveExisting;
		this.timeout = builder.timeout;
		this.settings = Objects.requireNonNull(builder.settings, "_value_body");

	}

	public PutSettingsRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * A comma-separated list of index names; use <code>_all</code> or empty string
	 * to perform the operation on all indices
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public List<String> index() {
		return this.index;
	}

	/**
	 * Whether to ignore if a wildcard indices expression resolves into no concrete
	 * indices. (This includes <code>_all</code> string or when no indices have been
	 * specified)
	 * <p>
	 * API name: {@code allow_no_indices}
	 */
	@Nullable
	public Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * Whether to expand wildcard expression to concrete indices that are open,
	 * closed or both.
	 * <p>
	 * API name: {@code expand_wildcards}
	 */
	@Nullable
	public List<ExpandWildcardOptions> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * Return settings in flat format (default: false)
	 * <p>
	 * API name: {@code flat_settings}
	 */
	@Nullable
	public Boolean flatSettings() {
		return this.flatSettings;
	}

	/**
	 * Whether specified concrete indices should be ignored when unavailable
	 * (missing or closed)
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * Specify timeout for connection to master
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public String masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Whether to update existing settings. If set to <code>true</code> existing
	 * settings on an index remain unchanged, the default is <code>false</code>
	 * <p>
	 * API name: {@code preserve_existing}
	 */
	@Nullable
	public Boolean preserveExisting() {
		return this.preserveExisting;
	}

	/**
	 * Explicit operation timeout
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public String timeout() {
		return this.timeout;
	}

	/**
	 * Request body.
	 * <p>
	 * API name: {@code _value_body}
	 */
	public IndexSettings settings() {
		return this.settings;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		this.settings.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutSettingsRequest}.
	 */
	public static class Builder implements ObjectBuilder<PutSettingsRequest> {
		@Nullable
		private List<String> index;

		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private List<ExpandWildcardOptions> expandWildcards;

		@Nullable
		private Boolean flatSettings;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private String masterTimeout;

		@Nullable
		private Boolean preserveExisting;

		@Nullable
		private String timeout;

		private IndexSettings settings;

		/**
		 * A comma-separated list of index names; use <code>_all</code> or empty string
		 * to perform the operation on all indices
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(@Nullable List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * A comma-separated list of index names; use <code>_all</code> or empty string
		 * to perform the operation on all indices
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #index(List)}, creating the list if needed. 4
		 */
		public Builder addIndex(String value) {
			if (this.index == null) {
				this.index = new ArrayList<>();
			}
			this.index.add(value);
			return this;
		}

		/**
		 * Whether to ignore if a wildcard indices expression resolves into no concrete
		 * indices. (This includes <code>_all</code> string or when no indices have been
		 * specified)
		 * <p>
		 * API name: {@code allow_no_indices}
		 */
		public Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * Whether to expand wildcard expression to concrete indices that are open,
		 * closed or both.
		 * <p>
		 * API name: {@code expand_wildcards}
		 */
		public Builder expandWildcards(@Nullable List<ExpandWildcardOptions> value) {
			this.expandWildcards = value;
			return this;
		}

		/**
		 * Whether to expand wildcard expression to concrete indices that are open,
		 * closed or both.
		 * <p>
		 * API name: {@code expand_wildcards}
		 */
		public Builder expandWildcards(ExpandWildcardOptions... value) {
			this.expandWildcards = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #expandWildcards(List)}, creating the list if needed. 4
		 */
		public Builder addExpandWildcards(ExpandWildcardOptions value) {
			if (this.expandWildcards == null) {
				this.expandWildcards = new ArrayList<>();
			}
			this.expandWildcards.add(value);
			return this;
		}

		/**
		 * Return settings in flat format (default: false)
		 * <p>
		 * API name: {@code flat_settings}
		 */
		public Builder flatSettings(@Nullable Boolean value) {
			this.flatSettings = value;
			return this;
		}

		/**
		 * Whether specified concrete indices should be ignored when unavailable
		 * (missing or closed)
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * Specify timeout for connection to master
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public Builder masterTimeout(@Nullable String value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Whether to update existing settings. If set to <code>true</code> existing
		 * settings on an index remain unchanged, the default is <code>false</code>
		 * <p>
		 * API name: {@code preserve_existing}
		 */
		public Builder preserveExisting(@Nullable Boolean value) {
			this.preserveExisting = value;
			return this;
		}

		/**
		 * Explicit operation timeout
		 * <p>
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Request body.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public Builder settings(IndexSettings value) {
			this.settings = value;
			return this;
		}

		/**
		 * Request body.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public Builder settings(Function<IndexSettings.Builder, ObjectBuilder<IndexSettings>> fn) {
			return this.settings(fn.apply(new IndexSettings.Builder()).build());
		}

		/**
		 * Builds a {@link PutSettingsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutSettingsRequest build() {

			return new PutSettingsRequest(this);
		}
	}

	public static final JsonpDeserializer<PutSettingsRequest> _DESERIALIZER = createPutSettingsRequestDeserializer();
	protected static JsonpDeserializer<PutSettingsRequest> createPutSettingsRequestDeserializer() {

		JsonpDeserializer<IndexSettings> valueDeserializer = IndexSettings._DESERIALIZER;

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.settings(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.put_settings}".
	 */
	public static final Endpoint<PutSettingsRequest, PutSettingsResponse, ElasticsearchError> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				if (request.index() != null)
					propsSet |= _index;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_settings");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_settings");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.allowNoIndices != null) {
					params.put("allow_no_indices", String.valueOf(request.allowNoIndices));
				}
				if (request.expandWildcards != null) {
					params.put("expand_wildcards",
							request.expandWildcards.stream().map(v -> v.toString()).collect(Collectors.joining(",")));
				}
				if (request.flatSettings != null) {
					params.put("flat_settings", String.valueOf(request.flatSettings));
				}
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout);
				}
				if (request.preserveExisting != null) {
					params.put("preserve_existing", String.valueOf(request.preserveExisting));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutSettingsResponse._DESERIALIZER);
}
