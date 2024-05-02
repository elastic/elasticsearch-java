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

package co.elastic.clients.elasticsearch.connector;

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
import java.lang.Integer;
import java.lang.String;
import java.util.List;
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

// typedef: connector._types.CustomSchedulingConfigurationOverrides

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#connector._types.CustomSchedulingConfigurationOverrides">API
 *      specification</a>
 */
@JsonpDeserializable
public class CustomSchedulingConfigurationOverrides implements JsonpSerializable {
	@Nullable
	private final Integer maxCrawlDepth;

	@Nullable
	private final Boolean sitemapDiscoveryDisabled;

	private final List<String> domainAllowlist;

	private final List<String> sitemapUrls;

	private final List<String> seedUrls;

	// ---------------------------------------------------------------------------------------------

	private CustomSchedulingConfigurationOverrides(Builder builder) {

		this.maxCrawlDepth = builder.maxCrawlDepth;
		this.sitemapDiscoveryDisabled = builder.sitemapDiscoveryDisabled;
		this.domainAllowlist = ApiTypeHelper.unmodifiable(builder.domainAllowlist);
		this.sitemapUrls = ApiTypeHelper.unmodifiable(builder.sitemapUrls);
		this.seedUrls = ApiTypeHelper.unmodifiable(builder.seedUrls);

	}

	public static CustomSchedulingConfigurationOverrides of(
			Function<Builder, ObjectBuilder<CustomSchedulingConfigurationOverrides>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code max_crawl_depth}
	 */
	@Nullable
	public final Integer maxCrawlDepth() {
		return this.maxCrawlDepth;
	}

	/**
	 * API name: {@code sitemap_discovery_disabled}
	 */
	@Nullable
	public final Boolean sitemapDiscoveryDisabled() {
		return this.sitemapDiscoveryDisabled;
	}

	/**
	 * API name: {@code domain_allowlist}
	 */
	public final List<String> domainAllowlist() {
		return this.domainAllowlist;
	}

	/**
	 * API name: {@code sitemap_urls}
	 */
	public final List<String> sitemapUrls() {
		return this.sitemapUrls;
	}

	/**
	 * API name: {@code seed_urls}
	 */
	public final List<String> seedUrls() {
		return this.seedUrls;
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

		if (this.maxCrawlDepth != null) {
			generator.writeKey("max_crawl_depth");
			generator.write(this.maxCrawlDepth);

		}
		if (this.sitemapDiscoveryDisabled != null) {
			generator.writeKey("sitemap_discovery_disabled");
			generator.write(this.sitemapDiscoveryDisabled);

		}
		if (ApiTypeHelper.isDefined(this.domainAllowlist)) {
			generator.writeKey("domain_allowlist");
			generator.writeStartArray();
			for (String item0 : this.domainAllowlist) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.sitemapUrls)) {
			generator.writeKey("sitemap_urls");
			generator.writeStartArray();
			for (String item0 : this.sitemapUrls) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.seedUrls)) {
			generator.writeKey("seed_urls");
			generator.writeStartArray();
			for (String item0 : this.seedUrls) {
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
	 * Builder for {@link CustomSchedulingConfigurationOverrides}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<CustomSchedulingConfigurationOverrides> {
		@Nullable
		private Integer maxCrawlDepth;

		@Nullable
		private Boolean sitemapDiscoveryDisabled;

		@Nullable
		private List<String> domainAllowlist;

		@Nullable
		private List<String> sitemapUrls;

		@Nullable
		private List<String> seedUrls;

		/**
		 * API name: {@code max_crawl_depth}
		 */
		public final Builder maxCrawlDepth(@Nullable Integer value) {
			this.maxCrawlDepth = value;
			return this;
		}

		/**
		 * API name: {@code sitemap_discovery_disabled}
		 */
		public final Builder sitemapDiscoveryDisabled(@Nullable Boolean value) {
			this.sitemapDiscoveryDisabled = value;
			return this;
		}

		/**
		 * API name: {@code domain_allowlist}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>domainAllowlist</code>.
		 */
		public final Builder domainAllowlist(List<String> list) {
			this.domainAllowlist = _listAddAll(this.domainAllowlist, list);
			return this;
		}

		/**
		 * API name: {@code domain_allowlist}
		 * <p>
		 * Adds one or more values to <code>domainAllowlist</code>.
		 */
		public final Builder domainAllowlist(String value, String... values) {
			this.domainAllowlist = _listAdd(this.domainAllowlist, value, values);
			return this;
		}

		/**
		 * API name: {@code sitemap_urls}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>sitemapUrls</code>.
		 */
		public final Builder sitemapUrls(List<String> list) {
			this.sitemapUrls = _listAddAll(this.sitemapUrls, list);
			return this;
		}

		/**
		 * API name: {@code sitemap_urls}
		 * <p>
		 * Adds one or more values to <code>sitemapUrls</code>.
		 */
		public final Builder sitemapUrls(String value, String... values) {
			this.sitemapUrls = _listAdd(this.sitemapUrls, value, values);
			return this;
		}

		/**
		 * API name: {@code seed_urls}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>seedUrls</code>.
		 */
		public final Builder seedUrls(List<String> list) {
			this.seedUrls = _listAddAll(this.seedUrls, list);
			return this;
		}

		/**
		 * API name: {@code seed_urls}
		 * <p>
		 * Adds one or more values to <code>seedUrls</code>.
		 */
		public final Builder seedUrls(String value, String... values) {
			this.seedUrls = _listAdd(this.seedUrls, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CustomSchedulingConfigurationOverrides}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CustomSchedulingConfigurationOverrides build() {
			_checkSingleUse();

			return new CustomSchedulingConfigurationOverrides(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CustomSchedulingConfigurationOverrides}
	 */
	public static final JsonpDeserializer<CustomSchedulingConfigurationOverrides> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					CustomSchedulingConfigurationOverrides::setupCustomSchedulingConfigurationOverridesDeserializer);

	protected static void setupCustomSchedulingConfigurationOverridesDeserializer(
			ObjectDeserializer<CustomSchedulingConfigurationOverrides.Builder> op) {

		op.add(Builder::maxCrawlDepth, JsonpDeserializer.integerDeserializer(), "max_crawl_depth");
		op.add(Builder::sitemapDiscoveryDisabled, JsonpDeserializer.booleanDeserializer(),
				"sitemap_discovery_disabled");
		op.add(Builder::domainAllowlist, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"domain_allowlist");
		op.add(Builder::sitemapUrls, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"sitemap_urls");
		op.add(Builder::seedUrls, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"seed_urls");

	}

}
